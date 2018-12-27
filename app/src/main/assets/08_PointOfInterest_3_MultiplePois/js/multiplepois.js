/* Implementation of AR-Experience (aka "World"). */
var World = {
    /* True once data was fetched. */
    initiallyLoadedData: false,

    /* Different POI-Marker assets. */
    markerDrawableIdle: null,
    markerDrawableSelected: null,

    /* List of AR.GeoObjects that are currently shown in the scene / World. */
    markerList: [],

    /* the last selected marker. */
    currentMarker: null,

    /* Called to inject new POI data. */
    loadPoisFromJsonData: function loadPoisFromJsonDataFn(poiData) {
        /* Empty list of visible markers. */
        World.markerList = [];

        /* Start loading marker assets. */
        World.markerDrawableIdle = new AR.ImageResource("assets/marker_idle.png", {
            onError: World.onError
        });
        World.markerDrawableSelected = new AR.ImageResource("assets/marker_selected.png", {
            onError: World.onError
        });

        /* Loop through POI-information and create an AR.GeoObject (=Marker) per POI. */
        for (var currentPlaceNr = 0; currentPlaceNr < poiData.length; currentPlaceNr++) {
            var singlePoi = {
                "id": poiData[currentPlaceNr].id,
                "latitude": parseFloat(poiData[currentPlaceNr].latitude),
                "longitude": parseFloat(poiData[currentPlaceNr].longitude),
                //"altitude": parseFloat(poiData[currentPlaceNr].altitude),
                "altitude": parseFloat(AR.GeoObject.UNKNOWN_ALTITUDE),
                "title": poiData[currentPlaceNr].name,
                "description": poiData[currentPlaceNr].description
            };

            /*
                To be able to deselect a marker while the user taps on the empty screen, the World object holds an
                 array that contains each marker.
            */
            World.markerList.push(new Marker(singlePoi));
        }

        World.updateStatusMessage(currentPlaceNr + ' places loaded');
    },

    /* Updates status message shown in small "i"-button aligned bottom center. */
    updateStatusMessage: function updateStatusMessageFn(message, isWarning) {

        var themeToUse = isWarning ? "e" : "c";
        var iconToUse = isWarning ? "alert" : "info";

        $("#status-message").html(message);
        $("#popupInfoButton").buttonMarkup({
            theme: themeToUse,
            icon: iconToUse
        });
    },

    /* Location updates, fired every time you call architectView.setLocation() in native environment. */
    locationChanged: function locationChangedFn(lat, lon, alt, acc) {

        /*
            The custom function World.onLocationChanged checks with the flag World.initiallyLoadedData if the
            function was already called. With the first call of World.onLocationChanged an object that contains geo
            information will be created which will be later used to create a marker using the
            World.loadPoisFromJsonData function.
        */
        if (!World.initiallyLoadedData) {
            /*
                requestDataFromLocal with the geo information as parameters (latitude, longitude) creates different
                poi data to a random location in the user's vicinity.
            */
            World.requestDataFromLocal();
            World.initiallyLoadedData = true;
        }
    },

    /* Fired when user pressed maker in cam. */
    onMarkerSelected: function onMarkerSelectedFn(marker) {

        /* Deselect previous marker. */
        if (World.currentMarker) {
            if (World.currentMarker.poiData.id === marker.poiData.id) {
                return;
            }
            World.currentMarker.setDeselected(World.currentMarker);
        }

        /* Highlight current one. */
        marker.setSelected(marker);
        World.currentMarker = marker;
    },

    /* Screen was clicked but no geo-object was hit. */
    onScreenClick: function onScreenClickFn() {
        if (World.currentMarker) {
            World.currentMarker.setDeselected(World.currentMarker);
        }
    },

    /* Request POI data. */
    requestDataFromLocal: function requestDataFromLocalFn() {
        var poisToCreate = 20;
        var poiData = [];

        poiData.push({
                        "id": (1),
                        "longitude": (10.386862),
                        "latitude": (55.394789),
                        "description": (""),
                        //"altitude": "100.0",
                        "name": ("Aya Club")
                    });
        poiData.push({
                        "id": (2),
                        "longitude": (10.393642),
                        "latitude": (55.397724),
                        "description": (""),
                        //"altitude": "100.0",
                        "name": ("Nunchi")
                    });
        poiData.push({
                        "id": (3),
                        "longitude": (10.388306),
                        "latitude": (55.399308),
                        "description": (""),
                        //"altitude": "100.0",
                        "name": ("Sir Club")
                    });

        //Restaurants and cafe
        poiData.push({
                        "id": (4),
                        "longitude": (10.426501),
                        "latitude": (55.385143),
                        "description": (""),
                        //"altitude": "100.0",
                        "name": ("Café Victoria")
                    });
        poiData.push({
                        "id": (5),
                        "longitude": (10.381825),
                        "latitude": (55.394840),
                        "description": (""),
                        //"altitude": "100.0",
                        "name": ("Mona Lisa")
                    });
        poiData.push({
                         "id": (6),
                         "longitude": (10.383467),
                         "latitude": (55.395816),
                         "description": (""),
                         //"altitude": "100.0",
                         "name": ("Olivia Brasserie")
                     });
        // Hotspots
        poiData.push({
                         "id": (7),
                         "longitude": (10.382720),
                         "latitude": (55.404331),
                         "description": (""),
                         //"altitude": "100.0",
                         "name": ("Storms pakhus")
                     });
        poiData.push({
                         "id": (8),
                         "longitude": (10.383435),
                         "latitude": (55.394638),
                         "description": (""),
                         //"altitude": "100.0",
                         "name": ("Arkaden")
                     });
        poiData.push({
                         "id": (9),
                         "longitude": (10.390108),
                         "latitude": (55.394641),
                         "description": (""),
                         //"altitude": "100.0",
                         "name": ("Eventyrhaven")
                     });


        World.loadPoisFromJsonData(poiData);
    },

    onError: function onErrorFn(error) {
        alert(error)
    }
};

function calculateGeoDifferenceFn(currentLat, poiLat){
        var difference;
        difference = currentLat - poiLat;

        if(difference < 0){
            difference = (difference * (-1));
        }
        return difference;
}

/*
    Set a custom function where location changes are forwarded to. There is also a possibility to set
    AR.context.onLocationChanged to null. In this case the function will not be called anymore and no further
    location updates will be received.
*/
AR.context.onLocationChanged = World.locationChanged;

/*
    To detect clicks where no drawable was hit set a custom function on AR.context.onScreenClick where the
    currently selected marker is deselected.
*/
AR.context.onScreenClick = World.onScreenClick;