package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.icons724dv2.Model.Rentals;
import com.example.icons724dv2.Model.Requests;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EmployeeRentals extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference rentalsRef;
    private RecyclerView recyclerView2;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_rentals);
        recyclerView2 =findViewById(R.id.recycler2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        final DatabaseReference rentalsREF = FirebaseDatabase.getInstance().getReference().child("Rentals");
        FirebaseRecyclerOptions<Rentals> options= new FirebaseRecyclerOptions.Builder<Rentals>().setQuery(rentalsREF, Rentals.class).build();

        FirebaseRecyclerAdapter<Rentals, RentalsViewHolder> adapter = new FirebaseRecyclerAdapter<Rentals, RentalsViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull RentalsViewHolder holder, int position, @NonNull Rentals model) {

                holder.Name.setText(model.getName());
                holder.Email.setText(model.getEmail());
                holder.StudentID.setText(model.getStudentID());
                holder.RoomNumber.setText(model.getRoomNumber());

                final DatabaseReference nameRef = FirebaseDatabase.getInstance().getReference().child("Equipment");
                nameRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {




                        if (model.getItem1()==""){
                            holder.Item1.setVisibility(View.GONE);
                        }
                        else{
                            String temp=snapshot.child(model.getItem1T()).child(model.getItem1()).child("Name").getValue().toString();
                            holder.Item1.setText("• " + temp);
                        }

                        if (model.getItem2()==""){
                            holder.Item2.setVisibility(View.GONE);
                        }
                        else{
                            String temp=snapshot.child(model.getItem2T()).child(model.getItem2()).child("Name").getValue().toString();
                            holder.Item2.setText("• " + temp);
                        }

                        if (model.getItem3()==""){
                            holder.Item3.setVisibility(View.GONE);
                        }
                        else{
                            String temp=snapshot.child(model.getItem3T()).child(model.getItem3()).child("Name").getValue().toString();
                            holder.Item3.setText("• " + temp);
                        }

                        if (model.getItem4()==""){
                            holder.Item4.setVisibility(View.GONE);
                        }
                        else{
                            String temp=snapshot.child(model.getItem4T()).child(model.getItem4()).child("Name").getValue().toString();
                            holder.Item4.setText("• " + temp);
                        }

                        if (model.getItem5()==""){
                            holder.Item5.setVisibility(View.GONE);
                        }
                        else{
                            String temp=snapshot.child(model.getItem5T()).child(model.getItem5()).child("Name").getValue().toString();
                            holder.Item5.setText("• " + temp);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                holder.returned.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final DatabaseReference fromPath = FirebaseDatabase.getInstance().getReference();

                        fromPath.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.child("Rentals").child(model.getOrderID()).child("Item1").exists()){
                                    String stock = snapshot.child("Equipment").child(model.getItem1T()).child(model.getItem1()).child("Stock").getValue().toString();
                                    int i = Integer.parseInt(stock);
                                    fromPath.child("Equipment").child(model.getItem1T()).child(model.getItem1()).child("Stock").setValue(i+1);
                                }
                                if (snapshot.child("Rentals").child(model.getOrderID()).child("Item2").exists()){
                                    String stock = snapshot.child("Equipment").child(model.getItem2T()).child(model.getItem2()).child("Stock").getValue().toString();
                                    int i = Integer.parseInt(stock);
                                    fromPath.child("Equipment").child(model.getItem2T()).child(model.getItem2()).child("Stock").setValue(i+1);
                                }
                                if (snapshot.child("Rentals").child(model.getOrderID()).child("Item3").exists()){
                                    String stock = snapshot.child("Equipment").child(model.getItem3T()).child(model.getItem3()).child("Stock").getValue().toString();
                                    int i = Integer.parseInt(stock);
                                    fromPath.child("Equipment").child(model.getItem3T()).child(model.getItem3()).child("Stock").setValue(i+1);
                                }
                                if (snapshot.child("Rentals").child(model.getOrderID()).child("Item4").exists()){
                                    String stock = snapshot.child("Equipment").child(model.getItem4T()).child(model.getItem4()).child("Stock").getValue().toString();
                                    int i = Integer.parseInt(stock);
                                    fromPath.child("Equipment").child(model.getItem4T()).child(model.getItem4()).child("Stock").setValue(i+1);
                                }
                                if (snapshot.child("Rentals").child(model.getOrderID()).child("Item5").exists()){
                                    String stock = snapshot.child("Equipment").child(model.getItem5T()).child(model.getItem5()).child("Stock").getValue().toString();
                                    int i = Integer.parseInt(stock);
                                    fromPath.child("Equipment").child(model.getItem5T()).child(model.getItem5()).child("Stock").setValue(i+1);
                                }

                                fromPath.child("Rentals").child(model.getOrderID()).removeValue();




                            }




                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }



                });



            }

            @NonNull
            @Override
            public RentalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_rental_layout, parent, false);
                return new RentalsViewHolder(view );
            }
        };
        recyclerView2.setAdapter(adapter);
        adapter.startListening();

    }

    final DatabaseReference rentalStock = FirebaseDatabase.getInstance().getReference();



    public static class RentalsViewHolder extends RecyclerView.ViewHolder {
        public TextView Email, Name, RoomNumber, StudentID, Item1, Item2, Item3, Item4, Item5, Item1T, Item2T, Item3T, Item4T, Item5T;
        public Button returned;


        public RentalsViewHolder(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.displayNamer);
            Email=itemView.findViewById(R.id.displaystudEmailr);
            RoomNumber=itemView.findViewById(R.id.displayRoomr);
            StudentID=itemView.findViewById(R.id.displaystudIDr);
            Item1=itemView.findViewById(R.id.item1r);
            Item2=itemView.findViewById(R.id.item2r);
            Item3=itemView.findViewById(R.id.item3r);
            Item4=itemView.findViewById(R.id.item4r);
            Item5=itemView.findViewById(R.id.item5r);
            returned=itemView.findViewById(R.id.returnedBtn);

        }
    }

    ;


}