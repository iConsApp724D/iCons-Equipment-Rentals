package com.example.icons724dv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.icons724dv2.Model.Requests;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class EmployeeRequests extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference requestsRef;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_requests);
        recyclerView =findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    @Override
    protected void onStart() {
        super.onStart();
        final DatabaseReference requestsRef = FirebaseDatabase.getInstance().getReference().child("Requests");
        FirebaseRecyclerOptions<Requests> options= new FirebaseRecyclerOptions.Builder<Requests>().setQuery(requestsRef, Requests.class).build();

        FirebaseRecyclerAdapter<Requests, RequestsViewHolder> adapter = new FirebaseRecyclerAdapter<Requests, RequestsViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull RequestsViewHolder holder, int position, @NonNull Requests model) {

                holder.Name.setText(model.getName());
                holder.Email.setText(model.getEmail());
                holder.StudentID.setText(model.getStudentID());
                holder.RoomNumber.setText(model.getRoomNumber());
                holder.Item1.setText("• " + model.getItem1());
                holder.Item2.setText("• " + model.getItem2());
                holder.Item3.setText("• " + model.getItem3());
                holder.Item4.setText("• " + model.getItem4());
                holder.Item5.setText("• " + model.getItem5());
            }

            @NonNull
            @Override
            public RequestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_request_layout, parent, false);
                return new RequestsViewHolder(view );
            }
        };
        recyclerView.setAdapter(adapter);
        adapter.startListening();

    }


    public static class RequestsViewHolder extends RecyclerView.ViewHolder {
        public TextView Email, Name, RoomNumber, StudentID, Item1, Item2, Item3, Item4, Item5;
        public Button delivered;


        public RequestsViewHolder(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.displayName);
            Email=itemView.findViewById(R.id.displaystudEmail);
            RoomNumber=itemView.findViewById(R.id.displayRoom);
            StudentID=itemView.findViewById(R.id.displaystudID);
            Item1=itemView.findViewById(R.id.item1);
            Item2=itemView.findViewById(R.id.item2);
            Item3=itemView.findViewById(R.id.item3);
            Item4=itemView.findViewById(R.id.item4);
            Item5=itemView.findViewById(R.id.item5);
            delivered=itemView.findViewById(R.id.deliveredBtn);

        }
    }

    ;
}