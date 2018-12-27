package com.example.bruger.knowwhere;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nevethan
 */

public class DataManager {

    List<Establishment> establishments = new ArrayList<>();
    List<User> users = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    List<Post> barPosts = new ArrayList<>();
    List<Post> hotPosts = new ArrayList<>();
    List<Post> cafePosts = new ArrayList<>();

    List<Establishment> barEstablishments = new ArrayList<>();
    List<Establishment> hotEstablishments = new ArrayList<>();
    List<Establishment> cafeEstablishments = new ArrayList<>();

    List<Establishment> allEstablishments = new ArrayList<>();

    private static DataManager instance = new DataManager();

    private DataManager(){}

    public static DataManager getInstance(){
        return instance;
    }

    public List<Establishment> getAllEstablishments(){
        allEstablishments.clear();
        allEstablishments.add(new Establishment("Aya Club", "Klingenberg 14, 5000 Odense", " Aya Club is a nightclub located on Klingenberg, where there is good time in town life. The nightclub is therefore located in the center of Odense and there are good transport options around the bar. Aya Club is a popular nightclub in the nightlife of Odense. The place is 18+ so as soon as you're 18, you can move your hips and shake the numb to the most played songs that are up in time.", "Clubs, Bars & Pubs", 55.394789, 10.386862, 3, R.drawable.aya_club));
        allEstablishments.add(new Establishment("Storms pakhus", "Seebladsgade 21, 5000 Odense", " At Storm's Pakhus you will find Fyen's greatest firefighters. Some of them make food while others cut hair. You can go shopping or meet over a specialty beer. In food booths, fynske råvarer are prioritized because we like to keep it locally. The little family will love our baby room, like friends, they will be able to walk together at the little house.", "Hotspots", 55.404331, 10.38272, 4.5, R.drawable.storms_pakhus));
        allEstablishments.add(new Establishment("Sir Club", "Nørregade 49, 5000 Odense", " Sir Club is a mix between a pub, sports cafe, bodega and is a really cozy place with many young people. Sir Club is well-known for its fine selection of foreign beers and its relaxed and cozy atmosphere. The foreign specialty beer is served at student-friendly prices in the same way as the rest of the bar selection. The atmosphere is always good at Sir Club and the selection of beer quite nice.", "Clubs, Bars & Pubs", 55.399308, 10.388306, 4, R.drawable.sir_club));
        allEstablishments.add(new Establishment("Café Victoria", "Ørbækvej 75, 5220 Odense", "Café Victoria - A unique international dining experience, where everyone can join. Behind Café Victoria is a quality-proven team, all of which have a high standard requirement. It must be sublime from start to finish and this is expressed partly by the pride we all put into our work in the kitchen and the restaurant.  During the day you can choose to enjoy a delicious brunch or a lunch of our international menu. Or just one of our exciting coffee varieties with homemade cake or pie.", "Restaurants & Café", 55.385143, 10.426501, 4, R.drawable.cafe_victoria));
        allEstablishments.add(new Establishment("Nunchi", "Overgade 45, 5000 Odense", " In the middle of a tropical rain forest opens a colorful, fun, cozy and festive garden! Nunchi is a secret oasis in the middle of a tropical rainforest, and its small cozy garden offers a Saturday club for party-lovers. Whether you want to meet new happy people or to hang out with your friends in a pleasant environment. We are not tall in the hat or snuggled in the door. The dress code is casual, it's your attitude and the smile on your lips that ensure you access. So have your lovely mood, big smile and dance shoes, so make sure you come home with good memories. See you to the city's warmest party every Saturday - which we create together. Minimum. 20 years", "Clubs, Bars & Pubs", 55.397724, 10.393642, 4.5, R.drawable.nunchi));
        allEstablishments.add(new Establishment("Olivia Brasserie", "Vintapperstræde 37, 5000 Odense", " Olivia offers great experiences and oozes mood and history; large exposed beams frame the ceiling and tell stories from when the building was a horse stable in a bygone era.  Olivia is decorated with inspiration from the beautiful Parisian brasseries. The old newspapers, beautiful pictures, big mirrors and simple red furniture contrast with the old beams. All in all, an atmospheric Brasserie, where you will experience a casual and cozy atmosphere, with exciting and inspiring food.  We put pride in everything from the hearty brunch to the rustic evening meals. The raw materials are of the highest quality both for our lunch dishes, our homemade cakes and our evening meals.  Olivia Brasserie is a short and relaxed atmosphere, great flavors, exciting wines, and rustic food made from the best ingredients of the season.", "Restaurants & Café", 55.395816, 10.383467, 4, R.drawable.olivia));
        allEstablishments.add(new Establishment("Mona Lisa", "Brandts Passage 9-11, 5000 Odense", " Restaurant Mona Lisa is a classic Italian restaurant that offers true Italian atmosphere and a dining experience that says save two! Here you will not only serve pizza and pasta dishes, but also a number of other Italian delights. The restaurant's menu card offers several Italian specialties with high-quality ingredients made from classic Italian cooking. Here no compromises are made!  Restaurant Mona Lisa takes pride in quality and service; Here you will receive special-class service and a taste experience that you will soon forget.", "Restaurants & Café", 55.39484, 10.381825, 4.5,R.drawable.monalisa));
        allEstablishments.add(new Establishment("Eventyrhaven", "Eventyrhaven, 5000 Odense", " The adventure garden is the small park, located at the Odense river behind the cathedral. The park includes some sculptures and a small island.", "Hotspots", 55.394641, 10.390108, 5,R.drawable.eventyrhaven));
        allEstablishments.add(new Establishment("Arkaden Food Market", "Vestergade 68, 5000 Odense", "In the Arkaden Food Market you can enjoy street food inspired food and drink from all corners of the world.  We at Arkaden Food Market have long been pleased to show you the iconic Arcade premises in new clothes, where passionate kitchens are ready to give you food experiences from several corners of the world.  Odense's former party center, Arkaden, has gained a new life as a food-temple under the name Arkaden Food Market. Distributed to 22 food stalls and three bars, we draw the best from the near and distant world.", "Hotspots", 55.394638, 10.383435, 4.5,R.drawable.arkaden));

        return allEstablishments;
    }

    public void getEstablishments(){
        establishments.clear();
        establishments.add(new Establishment("Aya Club", "Klingenberg 14, 5000 Odense", " Aya Club is a nightclub located on Klingenberg, where there is good time in town life. The nightclub is therefore located in the center of Odense and there are good transport options around the bar. Aya Club is a popular nightclub in the nightlife of Odense. The place is 18+ so as soon as you're 18, you can move your hips and shake the numb to the most played songs that are up in time.", "Clubs, Bars & Pubs", 55.394789, 10.386862, 3, R.drawable.aya_club));
        establishments.add(new Establishment("Storms pakhus", "Seebladsgade 21, 5000 Odense", " At Storm's Pakhus you will find Fyen's greatest firefighters. Some of them make food while others cut hair. You can go shopping or meet over a specialty beer. In food booths, fynske råvarer are prioritized because we like to keep it locally. The little family will love our baby room, like friends, they will be able to walk together at the little house.", "Hotspots", 55.404331, 10.38272, 4.5, R.drawable.storms_pakhus));
        establishments.add(new Establishment("Sir Club", "Nørregade 49, 5000 Odense", " Sir Club is a mix between a pub, sports cafe, bodega and is a really cozy place with many young people. Sir Club is well-known for its fine selection of foreign beers and its relaxed and cozy atmosphere. The foreign specialty beer is served at student-friendly prices in the same way as the rest of the bar selection. The atmosphere is always good at Sir Club and the selection of beer quite nice.", "Clubs, Bars & Pubs", 55.399308, 10.388306, 4, R.drawable.sir_club));
        establishments.add(new Establishment("Café Victoria", "Ørbækvej 75, 5220 Odense", "Café Victoria - A unique international dining experience, where everyone can join. Behind Café Victoria is a quality-proven team, all of which have a high standard requirement. It must be sublime from start to finish and this is expressed partly by the pride we all put into our work in the kitchen and the restaurant.  During the day you can choose to enjoy a delicious brunch or a lunch of our international menu. Or just one of our exciting coffee varieties with homemade cake or pie.", "Restaurants & Café", 55.385143, 10.426501, 4, R.drawable.cafe_victoria));
        establishments.add(new Establishment("Nunchi", "Overgade 45, 5000 Odense", " In the middle of a tropical rain forest opens a colorful, fun, cozy and festive garden! Nunchi is a secret oasis in the middle of a tropical rainforest, and its small cozy garden offers a Saturday club for party-lovers. Whether you want to meet new happy people or to hang out with your friends in a pleasant environment. We are not tall in the hat or snuggled in the door. The dress code is casual, it's your attitude and the smile on your lips that ensure you access. So have your lovely mood, big smile and dance shoes, so make sure you come home with good memories. See you to the city's warmest party every Saturday - which we create together. Minimum. 20 years", "Clubs, Bars & Pubs", 55.397724, 10.393642, 4.5, R.drawable.nunchi));
        establishments.add(new Establishment("Olivia Brasserie", "Vintapperstræde 37, 5000 Odense", " Olivia offers great experiences and oozes mood and history; large exposed beams frame the ceiling and tell stories from when the building was a horse stable in a bygone era.  Olivia is decorated with inspiration from the beautiful Parisian brasseries. The old newspapers, beautiful pictures, big mirrors and simple red furniture contrast with the old beams. All in all, an atmospheric Brasserie, where you will experience a casual and cozy atmosphere, with exciting and inspiring food.  We put pride in everything from the hearty brunch to the rustic evening meals. The raw materials are of the highest quality both for our lunch dishes, our homemade cakes and our evening meals.  Olivia Brasserie is a short and relaxed atmosphere, great flavors, exciting wines, and rustic food made from the best ingredients of the season.", "Restaurants & Café", 55.395816, 10.383467, 4, R.drawable.olivia));
        establishments.add(new Establishment("Mona Lisa", "Brandts Passage 9-11, 5000 Odense", " Restaurant Mona Lisa is a classic Italian restaurant that offers true Italian atmosphere and a dining experience that says save two! Here you will not only serve pizza and pasta dishes, but also a number of other Italian delights. The restaurant's menu card offers several Italian specialties with high-quality ingredients made from classic Italian cooking. Here no compromises are made!  Restaurant Mona Lisa takes pride in quality and service; Here you will receive special-class service and a taste experience that you will soon forget.", "Restaurants & Café", 55.39484, 10.381825, 4.5,R.drawable.monalisa));
        establishments.add(new Establishment("H. C. Anderson Paraden (Eventyrhaven)", "Eventyrhaven, 5000 Odense", " The adventure garden is the small park, located at the Odense river behind the cathedral. The park includes some sculptures and a small island.", "Hotspots", 55.394641, 10.390108, 5,R.drawable.eventyrhaven));
        establishments.add(new Establishment("Arkaden Food Market", "Vestergade 68, 5000 Odense", "In the Arkaden Food Market you can enjoy street food inspired food and drink from all corners of the world.  We at Arkaden Food Market have long been pleased to show you the iconic Arcade premises in new clothes, where passionate kitchens are ready to give you food experiences from several corners of the world.  Odense's former party center, Arkaden, has gained a new life as a food-temple under the name Arkaden Food Market. Distributed to 22 food stalls and three bars, we draw the best from the near and distant world.", "Hotspots", 55.394638, 10.383435, 4.5,R.drawable.arkaden));

    }

    private List<User> getUsers(){
        users.add(new User("nevethan", "1234"));
        users.add(new User("neala", "Rf!71@G3a8X"));
        users.add(new User("neve", "1234"));

        return users;
    }

    public void getPosts(){
        posts.add(new Post("Beer Pong Tournament", "Aya Club", "Clubs, Bars & Pubs"));
        posts.add(new Post("Valentine Festival", "Storms pakhus", "Hotspots"));
        posts.add(new Post("Gentlemen Night. Free beer until 23 o'clock", "Sir Club", "Clubs, Bars & Pubs"));
        posts.add(new Post("Free Deserts with Student ID", "Café Victoria", "Restaurants & Café"));
        posts.add(new Post("Kesi is performing", "Nunchi", "Clubs, Bars & Pubs"));
        posts.add(new Post("25% discount with Student ID", "Olivia Brasserie", "Restaurants & Café"));
        posts.add(new Post("New menu. Come and try it.", "Mona Lisa", "Restaurants & Café"));
        posts.add(new Post("Christmas Market", "H. C. Anderson Paraden (Eventyrhaven)", "Hotspots"));
        posts.add(new Post("Chinese new year Celebration", "Arkaden Food Market", "Hotspots"));
    }

    public boolean checkUserCredentials(String username, String password){
        for(User user : getUsers()){
            if(user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkRegisterCredentials(String username, String password){
        for(User user : getUsers()){
            if(user.getUsername().equals(username)){
                return true;
            }else{
                users.add(new User(username,password));
                return false;
            }
        }
        return false;
    }

    public void allCategory(){
        posts.clear();
        establishments.clear();

        getEstablishments();
        getPosts();

        posts = returnPostList();
        establishments = returnEstablishmentList();
    }

    private void barList() {
        barPosts.add(new Post("Beer Pong Tournament", "Aya Club", "Clubs, Bars & Pubs"));
        barPosts.add(new Post("Gentlemen Night. Free beer until 23 o'clock", "Sir Club", "Clubs, Bars & Pubs"));
        barPosts.add(new Post("Kesi is performing", "Nunchi", "Clubs, Bars & Pubs"));

        barEstablishments.add(new Establishment("Aya Club", "Klingenberg 14, 5000 Odense", " Aya Club is a nightclub located on Klingenberg, where there is good time in town life. The nightclub is therefore located in the center of Odense and there are good transport options around the bar. Aya Club is a popular nightclub in the nightlife of Odense. The place is 18+ so as soon as you're 18, you can move your hips and shake the numb to the most played songs that are up in time.", "Clubs, Bars & Pubs", 55.394789, 10.386862, 3, R.drawable.aya_club));
        barEstablishments.add(new Establishment("Sir Club", "Nørregade 49, 5000 Odense", " Sir Club is a mix between a pub, sports cafe, bodega and is a really cozy place with many young people. Sir Club is well-known for its fine selection of foreign beers and its relaxed and cozy atmosphere. The foreign specialty beer is served at student-friendly prices in the same way as the rest of the bar selection. The atmosphere is always good at Sir Club and the selection of beer quite nice.", "Clubs, Bars & Pubs", 55.399308, 10.388306, 4, R.drawable.sir_club));
        barEstablishments.add(new Establishment("Nunchi", "Overgade 45, 5000 Odense", " In the middle of a tropical rain forest opens a colorful, fun, cozy and festive garden! Nunchi is a secret oasis in the middle of a tropical rainforest, and its small cozy garden offers a Saturday club for party-lovers. Whether you want to meet new happy people or to hang out with your friends in a pleasant environment. We are not tall in the hat or snuggled in the door. The dress code is casual, it's your attitude and the smile on your lips that ensure you access. So have your lovely mood, big smile and dance shoes, so make sure you come home with good memories. See you to the city's warmest party every Saturday - which we create together. Minimum. 20 years", "Clubs, Bars & Pubs", 55.397724, 10.393642, 4.5, R.drawable.nunchi));

    }

    public void barsCategory(){
        barList();
        posts.clear();
        establishments.clear();
        posts = barPosts;
        establishments = barEstablishments;
    }

    private void hotList(){
        hotPosts.add(new Post("Valentine Festival", "Storms pakhus", "Hotspots"));
        hotPosts.add(new Post("Christmas Market", "H. C. Anderson Paraden (Eventyrhaven)", "Hotspots"));
        hotPosts.add(new Post("Chinese new year Celebration", "Arkaden Food Market", "Hotspots"));

        hotEstablishments.add(new Establishment("Storms pakhus", "Seebladsgade 21, 5000 Odense", " At Storm's Pakhus you will find Fyen's greatest firefighters. Some of them make food while others cut hair. You can go shopping or meet over a specialty beer. In food booths, fynske råvarer are prioritized because we like to keep it locally. The little family will love our baby room, like friends, they will be able to walk together at the little house.", "Hotspots", 55.404331, 10.38272, 4.5, R.drawable.storms_pakhus));
        hotEstablishments.add(new Establishment("H. C. Anderson Paraden (Eventyrhaven)", "Eventyrhaven, 5000 Odense", " The adventure garden is the small park, located at the Odense river behind the cathedral. The park includes some sculptures and a small island.", "Hotspots", 55.394641, 10.390108, 5,R.drawable.eventyrhaven));
        hotEstablishments.add(new Establishment("Arkaden Food Market", "Vestergade 68, 5000 Odense", "In the Arkaden Food Market you can enjoy street food inspired food and drink from all corners of the world.  We at Arkaden Food Market have long been pleased to show you the iconic Arcade premises in new clothes, where passionate kitchens are ready to give you food experiences from several corners of the world.  Odense's former party center, Arkaden, has gained a new life as a food-temple under the name Arkaden Food Market. Distributed to 22 food stalls and three bars, we draw the best from the near and distant world.", "Hotspots", 55.394638, 10.383435, 4.5,R.drawable.arkaden));

    }

    public void hotCategory(){
        hotList();
        posts.clear();
        establishments.clear();
        posts = hotPosts;
        establishments = hotEstablishments;
    }

    private void cafeList(){
        cafeEstablishments.add(new Establishment("Café Victoria", "Ørbækvej 75, 5220 Odense", "Café Victoria - A unique international dining experience, where everyone can join. Behind Café Victoria is a quality-proven team, all of which have a high standard requirement. It must be sublime from start to finish and this is expressed partly by the pride we all put into our work in the kitchen and the restaurant.  During the day you can choose to enjoy a delicious brunch or a lunch of our international menu. Or just one of our exciting coffee varieties with homemade cake or pie.", "Restaurants & Café", 55.385143, 10.426501, 4, R.drawable.cafe_victoria));
        cafeEstablishments.add(new Establishment("Olivia Brasserie", "Vintapperstræde 37, 5000 Odense", " Olivia offers great experiences and oozes mood and history; large exposed beams frame the ceiling and tell stories from when the building was a horse stable in a bygone era.  Olivia is decorated with inspiration from the beautiful Parisian brasseries. The old newspapers, beautiful pictures, big mirrors and simple red furniture contrast with the old beams. All in all, an atmospheric Brasserie, where you will experience a casual and cozy atmosphere, with exciting and inspiring food.  We put pride in everything from the hearty brunch to the rustic evening meals. The raw materials are of the highest quality both for our lunch dishes, our homemade cakes and our evening meals.  Olivia Brasserie is a short and relaxed atmosphere, great flavors, exciting wines, and rustic food made from the best ingredients of the season.", "Restaurants & Café", 55.395816, 10.383467, 4, R.drawable.olivia));
        cafeEstablishments.add(new Establishment("Mona Lisa", "Brandts Passage 9-11, 5000 Odense", " Restaurant Mona Lisa is a classic Italian restaurant that offers true Italian atmosphere and a dining experience that says save two! Here you will not only serve pizza and pasta dishes, but also a number of other Italian delights. The restaurant's menu card offers several Italian specialties with high-quality ingredients made from classic Italian cooking. Here no compromises are made!  Restaurant Mona Lisa takes pride in quality and service; Here you will receive special-class service and a taste experience that you will soon forget.", "Restaurants & Café", 55.39484, 10.381825, 4.5,R.drawable.monalisa));

        cafePosts.add(new Post("Free Deserts with Student ID", "Café Victoria", "Restaurants & Café"));
        cafePosts.add(new Post("25% discount with Student ID", "Olivia Brasserie", "Restaurants & Café"));
        cafePosts.add(new Post("New menu. Come and try it.", "Mona Lisa", "Restaurants & Café"));
    }

    public void cafeCategory(){
        cafeList();
        posts.clear();
        establishments.clear();
        posts = cafePosts;
        establishments = cafeEstablishments;
    }

    public List<Establishment> returnEstablishmentList(){
        return establishments;
    }

    public List<Post> returnPostList(){
        return posts;
    }

}
