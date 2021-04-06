package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentCablesChargersList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;
    Button as,bs,cs,ds,es,fs,gs,hs,is,js,ks,ls,ms,ns,os;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cables_chargers_list);

        a=(TextView) findViewById(R.id.textViewACERCS);
        as=(Button)findViewById(R.id.buttonACERC);
        b=(TextView) findViewById(R.id.textViewASUSCS);
        bs=(Button)findViewById(R.id.buttonASUSC);
        c=(TextView) findViewById(R.id.textViewHDMIS);
        cs=(Button)findViewById(R.id.buttonHDMI);
        d=(TextView) findViewById(R.id.textViewHDTOLS);
        ds=(Button)findViewById(R.id.buttonHDTOL);
        e=(TextView) findViewById(R.id.textViewHDTOUCS);
        es=(Button)findViewById(R.id.buttonHDTOUC);
        f=(TextView) findViewById(R.id.textViewIPCS);
        fs=(Button)findViewById(R.id.buttonIPC);
        g=(TextView) findViewById(R.id.textViewLENCS);
        gs=(Button)findViewById(R.id.buttonLENC);
        h=(TextView) findViewById(R.id.textViewMACCS);
        hs=(Button)findViewById(R.id.buttonMACC);
        i=(TextView) findViewById(R.id.textViewMICROUS);
        is=(Button)findViewById(R.id.buttonMICROU);
        j=(TextView) findViewById(R.id.textViewMOUSS);
        js=(Button)findViewById(R.id.buttonMOUS);
        k=(TextView) findViewById(R.id.textViewUSBCS);
        ks=(Button)findViewById(R.id.buttonUSBC);
        l=(TextView) findViewById(R.id.textViewUSBTO35S);
        ls=(Button)findViewById(R.id.buttonUSBTO35);
        m=(TextView) findViewById(R.id.textViewVGAS);
        ms=(Button)findViewById(R.id.buttonVGA);
        n=(TextView) findViewById(R.id.textViewVGATOHDS);
        ns=(Button)findViewById(R.id.buttonVGATOHD;
        o=(TextView) findViewById(R.id.textViewVGATOLS);
        os=(Button)findViewById(R.id.buttonVGATOL);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Tech");
        getdata();

    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("AcerCharger").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                if(a1.equals("0")){as.setVisibility(View.GONE);}
                String b1=snapshot.child("AsusCharger").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                if(b1.equals("0")){bs.setVisibility(View.GONE);}
                String c1=snapshot.child("HDMI").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                if(c1.equals("0")){cs.setVisibility(View.GONE);}
                String d1=snapshot.child("HDMItoLightning").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                if(d1.equals("0")){ds.setVisibility(View.GONE);}
                String e1=snapshot.child("HDMItoUSBC").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                if(e1.equals("0")){es.setVisibility(View.GONE);}
                String f1=snapshot.child("LightningCable").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                if(f1.equals("0")){fs.setVisibility(View.GONE);}
                String g1=snapshot.child("LenovoCharger").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                if(g1.equals("0")){gs.setVisibility(View.GONE);}
                String h1=snapshot.child("MacbookCharger").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                if(h1.equals("0")){hs.setVisibility(View.GONE);}
                String i1=snapshot.child("MicroUSB").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                if(i1.equals("0")){is.setVisibility(View.GONE);}
                String j1=snapshot.child("Mouse").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                if(j1.equals("0")){js.setVisibility(View.GONE);}
                String k1=snapshot.child("USBC").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                if(k1.equals("0")){ks.setVisibility(View.GONE);}
                String l1=snapshot.child("USBCto35").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);
                if(l1.equals("0")){ls.setVisibility(View.GONE);}
                String m1=snapshot.child("VGA").child("Stock").getValue().toString();
                m.setText("Stock:  "+m1);
                if(m1.equals("0")){ms.setVisibility(View.GONE);}
                String n1=snapshot.child("VGAtoHDMI").child("Stock").getValue().toString();
                n.setText("Stock:  "+n1);
                if(n1.equals("0")){ns.setVisibility(View.GONE);}
                String o1=snapshot.child("VGAtoLightning").child("Stock").getValue().toString();
                o.setText("Stock:  "+o1);
                if(o1.equals("0")){os.setVisibility(View.GONE);}

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentCablesChargersList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void shopCart(View v){
        Intent a = new Intent(this, StudentCart.class);
        startActivity(a);
    }

    public void ACERC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.ACERC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void ASUSC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.ASUSC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDMI(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDMI = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDTOL(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDTOL = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDTOUC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDTOUC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void IPC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.IPC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void LENC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.LENC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MACC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MACC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MICROU(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MICROU = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MOUS(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MOUS = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void USBC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.USBC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }

    }
    public void USBTO35(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.USBTO35 = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGA(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGA = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGATOHD(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGATOHD = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGATOL(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGATOL = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }














}