package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentAfterOrder extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_after_order);


        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();





        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                while((snapshot.child("Requests").child(StringClass.studID).exists()||snapshot.child("Rentals").child(StringClass.studID).exists())) {
                    StringClass.studID = StringClass.studID + "-1";
                }
                databaseReference.child("Requests").child(StringClass.studID).child("Name").setValue(StringClass.name1);
                databaseReference.child("Requests").child(StringClass.studID).child("StudentID").setValue(StringClass.firstID);
                databaseReference.child("Requests").child(StringClass.studID).child("Email").setValue(StringClass.email);
                databaseReference.child("Requests").child(StringClass.studID).child("RoomNumber").setValue(StringClass.roomNumber);
                databaseReference.child("Requests").child(StringClass.studID).child("orderID").setValue(StringClass.studID);


                for(int i=0;i<inCart.inCartItems.size()/2;i++){
                    databaseReference.child("Requests").child(StringClass.studID).child("Item" + (i+1)).setValue(inCart.inCartItems.get(2*i));
                    databaseReference.child("Requests").child(StringClass.studID).child("Item" + (i+1)+"T").setValue(inCart.inCartItems.get(2*i+1));
                }

                if (!inCart.inCartItems.get(0).isEmpty()){
                    String stock = snapshot.child("Equipment").child(inCart.inCartItems.get(1)).child(inCart.inCartItems.get(0)).child("Stock").getValue().toString();
                    int current = Integer.parseInt(stock);
                    databaseReference.child("Equipment").child(inCart.inCartItems.get(1)).child(inCart.inCartItems.get(0)).child("Stock").setValue(current-1);
                }
                if (!inCart.inCartItems.get(2).isEmpty()){
                    String stock = snapshot.child("Equipment").child(inCart.inCartItems.get(3)).child(inCart.inCartItems.get(2)).child("Stock").getValue().toString();
                    int current = Integer.parseInt(stock);
                    databaseReference.child("Equipment").child(inCart.inCartItems.get(3)).child(inCart.inCartItems.get(2)).child("Stock").setValue(current-1);
                }

                if (!inCart.inCartItems.get(4).isEmpty()){
                    String stock = snapshot.child("Equipment").child(inCart.inCartItems.get(5)).child(inCart.inCartItems.get(4)).child("Stock").getValue().toString();
                    int current = Integer.parseInt(stock);
                    databaseReference.child("Equipment").child(inCart.inCartItems.get(5)).child(inCart.inCartItems.get(4)).child("Stock").setValue(current-1);
                }

                if (!inCart.inCartItems.get(6).isEmpty()){
                    String stock = snapshot.child("Equipment").child(inCart.inCartItems.get(6)).child(inCart.inCartItems.get(5)).child("Stock").getValue().toString();
                    int current = Integer.parseInt(stock);
                    databaseReference.child("Equipment").child(inCart.inCartItems.get(6)).child(inCart.inCartItems.get(5)).child("Stock").setValue(current-1);
                }

                if (!inCart.inCartItems.get(8).isEmpty()){
                    String stock = snapshot.child("Equipment").child(inCart.inCartItems.get(9)).child(inCart.inCartItems.get(8)).child("Stock").getValue().toString();
                    int current = Integer.parseInt(stock);
                    databaseReference.child("Equipment").child(inCart.inCartItems.get(9)).child(inCart.inCartItems.get(8)).child("Stock").setValue(current-1);
                }





            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }



    /*private void addToDatabase() {
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                while((snapshot.child("Requests").child(StringClass.studID).exists()||snapshot.child("Rentals").child(StringClass.studID).exists())) {
                    StringClass.studID = StringClass.studID + "-1";
                }
                databaseReference.child("Requests").child(StringClass.studID).child("Name").setValue(StringClass.name1);
                databaseReference.child("Requests").child(StringClass.studID).child("StudentID").setValue(StringClass.firstID);
                databaseReference.child("Requests").child(StringClass.studID).child("Email").setValue(StringClass.email);
                databaseReference.child("Requests").child(StringClass.studID).child("RoomNumber").setValue(StringClass.roomNumber);
                databaseReference.child("Requests").child(StringClass.studID).child("orderID").setValue(StringClass.studID);


                for(int i=0;i<inCart.inCartItems.size()/2;i++){
                    databaseReference.child("Requests").child(StringClass.studID).child("Item" + (i+1)).setValue(inCart.inCartItems.get(2*i));
                    databaseReference.child("Requests").child(StringClass.studID).child("Item" + (i+1)+"T").setValue(inCart.inCartItems.get(2*i+1));
                }




            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }*/




    public void toHome(View v){
        Intent a = new Intent(this, StudentHomeScreen.class);
        startActivity(a);
    }
}