package com.example.bruger.knowwhere;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Bruger on 21-11-2018.
 */

public class FirebaseManager {

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    DatabaseReference myRefEstablishments = database.getReference("Establishments");
    DatabaseReference myRefUsers = database.getReference("Users");

    public void writeNewMember(String username, String password){
        Member member = new Member(username, password);

        myRefUsers.child("Users").setValue(member);
    }

    public void readListOfEstablishments(){
        myRefEstablishments.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                readData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    public void readData(DataSnapshot dataSnapshot){
        for(DataSnapshot ds : dataSnapshot.getChildren()){
            Establishment establishment = new Establishment();


        }
    }
}
