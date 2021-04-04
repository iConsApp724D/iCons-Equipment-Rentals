package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class StudentConfirmOrder extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_confirm_order);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment");
        TextView text = (TextView) findViewById(R.id.textName);
        text.setText("Name:     "+StringClass.name1);

        TextView text2 = (TextView) findViewById(R.id.textStudentId);
        text2.setText("Student ID:   "+StringClass.studID);

        Spinner roomSelect = (Spinner) findViewById(R.id.spinnerRoom);
        roomSelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                StringClass.roomNumber=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(StudentConfirmOrder.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.Rooms));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        roomSelect.setAdapter(adapter);

        ArrayList<String> cartOrder= new ArrayList<String>();

        if (inCart.atc111Text==true){
            cartOrder.add("APSC111");
            cartOrder.add("Textbooks");
        }
        if (inCart.atc112Text==true){
            cartOrder.add("APSC112");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcCalc6Text==true){
            cartOrder.add("Calc6th");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcCalc7Text==true){
            cartOrder.add("Calc7th");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcGeo4Text==true){
            cartOrder.add("PhysicalGeo");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcELEC221Text==true){
            cartOrder.add("ELEC221");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcEE2Text==true){
            cartOrder.add("EngEcon2");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcEE4Text==true){
            cartOrder.add("EngEcon4");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcFLMText==true){
            cartOrder.add("FluidMech");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcF341Text==true){
            cartOrder.add("Fluids341");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcFCAText==true){
            cartOrder.add("ComplexAnalysis");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcFETText==true){
            cartOrder.add("EngThermo");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcCHEM10Text==true){
            cartOrder.add("GenChem10");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcMM8Text==true){
            cartOrder.add("MechMat");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcMM2Text==true){
            cartOrder.add("MenMgt2");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcME12Text==true){
            cartOrder.add("Microecon12");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcMG3Text==true){
            cartOrder.add("Graphics3");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcMG4Text==true){
            cartOrder.add("Graphics4");
            cartOrder.add("Textbooks");
        }
        if (inCart.atcMTHE406Text==true){
            cartOrder.add("MTHE406");
            cartOrder.add("Textbooks");
        }

        if (inCart.bp==true){
            cartOrder.add("Paper");
            cartOrder.add("Supplies");
        }
        if (inCart.hp==true){
            cartOrder.add("Holepunch");
            cartOrder.add("Supplies");
        }
        if (inCart.LG==true){
            cartOrder.add("Goggles");
            cartOrder.add("Supplies");
        }
        if (inCart.MT==true){
            cartOrder.add("MeasureTape");
            cartOrder.add("Supplies");
        }
        if (inCart.P==true){
            cartOrder.add("Pen");
            cartOrder.add("Supplies");
        }
        if (inCart.SG==true){
            cartOrder.add("SafeGlasses");
            cartOrder.add("Supplies");
        }
        if (inCart.SCI==true){
            cartOrder.add("Scissors");
            cartOrder.add("Supplies");
        }
        if (inCart.STAP==true){
            cartOrder.add("Stapler");
            cartOrder.add("Supplies");
        }
        if (inCart.STICK==true){
            cartOrder.add("Stickers");
            cartOrder.add("Supplies");
        }
        if (inCart.TAPE==true){
            cartOrder.add("Tape");
            cartOrder.add("Supplies");
        }
        if (inCart.WBM==true){
            cartOrder.add("DryErase");
            cartOrder.add("Supplies");
        }
        if (inCart.WO==true){
            cartOrder.add("WhiteOut");
            cartOrder.add("Supplies");
        }

        if (inCart.ACERC==true){
            cartOrder.add("AcerCharger");
            cartOrder.add("Tech");
        }
        if (inCart.ASUSC==true){
            cartOrder.add("AsusCharger");
            cartOrder.add("Tech");
        }
        if (inCart.HDMI==true){
            cartOrder.add("HDMI");
            cartOrder.add("Tech");
        }
        if (inCart.HDTOL==true){
            cartOrder.add("HDMItoLightning");
            cartOrder.add("Tech");
        }
        if (inCart.HDTOUC==true){
            cartOrder.add("HDMItoUSBC");
            cartOrder.add("Tech");
        }
        if (inCart.IPC==true){
            cartOrder.add("LightningCable");
            cartOrder.add("Tech");
        }
        if (inCart.LENC==true){
            cartOrder.add("LenovoCharger");
            cartOrder.add("Tech");
        }
        if (inCart.MACC==true){
            cartOrder.add("MacbookCharger");
            cartOrder.add("Tech");
        }
        if (inCart.MICROU==true){
            cartOrder.add("MicroUSB");
            cartOrder.add("Tech");
        }
        if (inCart.MOUS==true){
            cartOrder.add("Mouse");
            cartOrder.add("Tech");
        }
        if (inCart.USBC==true){
            cartOrder.add("USBC");
            cartOrder.add("Tech");
        }
        if (inCart.USBTO35==true){
            cartOrder.add("USBCto35");
            cartOrder.add("Tech");
        }
        if (inCart.VGA==true){
            cartOrder.add("VGA");
            cartOrder.add("Tech");
        }
        if (inCart.VGATOHD==true){
            cartOrder.add("VGAtoHDMI");
            cartOrder.add("Tech");
        }
        if (inCart.VGATOL==true){
            cartOrder.add("VGAtoLightning");
            cartOrder.add("Tech");
        }

        if (inCart.CC111==true){
            cartOrder.add("APSC111E");
            cartOrder.add("Workbooks");
        }
        if (inCart.CC112==true){
            cartOrder.add("APSC112E");
            cartOrder.add("Workbooks");
        }
        if (inCart.CC131==true){
            cartOrder.add("APSC131E");
            cartOrder.add("Workbooks");
        }
        if (inCart.CC132==true){
            cartOrder.add("ASPC132E");
            cartOrder.add("Workbooks");
        }
        if (inCart.CC172==true){
            cartOrder.add("APSC172E");
            cartOrder.add("Workbooks");
        }
        if (inCart.M172==true){
            cartOrder.add("APSC172M");
            cartOrder.add("Workbooks");
        }
        if (inCart.CC174==true){
            cartOrder.add("APSC174E");
            cartOrder.add("Workbooks");
        }
        if (inCart.ECON==true){
            cartOrder.add("ECON110112");
            cartOrder.add("Workbooks");
        }
        if (inCart.WB2014==true){
            cartOrder.add("2014APSC111");
            cartOrder.add("Workbooks");
        }
        if (inCart.WB2015==true){
            cartOrder.add("2015APSC111");
            cartOrder.add("Workbooks");
        }
        if (inCart.MTHE225==true){
            cartOrder.add("MTHE225Workbook");
            cartOrder.add("Workbooks");
        }

        ArrayList<TextView> cartItems = new ArrayList<TextView>();
        cartItems.add((TextView) findViewById(R.id.CartItem1));
        cartItems.add((TextView) findViewById(R.id.CartItem2));
        cartItems.add((TextView) findViewById(R.id.CartItem3));
        cartItems.add((TextView) findViewById(R.id.CartItem4));
        cartItems.add((TextView) findViewById(R.id.CartItem5));

        inCart.inCartItems=cartOrder;

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (int i=0;i<cartOrder.size()/2;i++){
                    String temp=snapshot.child(cartOrder.get(2*i+1)).child(cartOrder.get(2*i)).child("Name").getValue().toString();
                    cartItems.get(i).setText("• "+temp);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentConfirmOrder.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });


    }




    public void confirm(View v){

        if(StringClass.roomNumber.equals("Select Room Number") || StringClass.roomNumber.equals("none")){
            Toast.makeText(StudentConfirmOrder.this,"Please select a room number", Toast.LENGTH_SHORT).show();
        }
        else if(inCart.inCartItems.isEmpty()){
            Toast.makeText(StudentConfirmOrder.this,"Please add items to place a request", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent a = new Intent(this, StudentAfterOrder.class);
            startActivity(a);
            finish();
            databaseReference=firebaseDatabase.getInstance().getReference();
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.child("Requets").child(StringClass.name1).exists()){
                        StringClass.name1=StringClass.name1+1;
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(StudentConfirmOrder.this,"Failed to get data", Toast.LENGTH_SHORT).show();
                }
            });

            databaseReference.child("Requests").child(StringClass.name1).child("Name").setValue(StringClass.name1);
            databaseReference.child("Requests").child(StringClass.name1).child("Student ID").setValue(StringClass.studID);
            databaseReference.child("Requests").child(StringClass.name1).child("Email").setValue(StringClass.email);
            databaseReference.child("Requests").child(StringClass.name1).child("Room Number").setValue(StringClass.roomNumber);

            for(int i=0;i<inCart.inCartItems.size()/2;i++){
                databaseReference.child("Requests").child(StringClass.name1).child("Item " + (i+1)).setValue(inCart.inCartItems.get(i/2));
            }


        }



    }
}