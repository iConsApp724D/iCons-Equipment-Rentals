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

import org.w3c.dom.Text;


public class StudentTextbookList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;
    Button as,bs,cs,ds,es,fs,gs,hs,is,js,ks,ls,ms,ns,os,ps,qs,rs,ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_textbook_list);

        a=(TextView) findViewById(R.id.textViewAPSC111S);
        ss=(Button)findViewById(R.id.buttonAPSC111);
        b=(TextView) findViewById(R.id.textViewAPSC112S);
        bs=(Button)findViewById(R.id.buttonAPSC112);
        c=(TextView) findViewById(R.id.textViewCALC6S);
        cs=(Button)findViewById(R.id.buttonCALC6);
        d=(TextView) findViewById(R.id.textViewCALC7S);
        ds=(Button)findViewById(R.id.buttonCALC7);
        e=(TextView) findViewById(R.id.textViewGEO4S);
        es=(Button)findViewById(R.id.buttonGEO4);
        f=(TextView) findViewById(R.id.textViewELEC221S);
        fs=(Button)findViewById(R.id.buttonELEC221);
        g=(TextView) findViewById(R.id.textViewEE2S);
        gs=(Button)findViewById(R.id.buttonEE2);
        h=(TextView) findViewById(R.id.textViewEE4S);
        hs=(Button)findViewById(R.id.buttonEE4);
        i=(TextView) findViewById(R.id.textViewFLMS);
        is=(Button)findViewById(R.id.buttonFLM);
        j=(TextView) findViewById(R.id.textViewF341S);
        js=(Button)findViewById(R.id.buttonF341);
        k=(TextView) findViewById(R.id.textViewFCAS);
        ks=(Button)findViewById(R.id.buttonFCA);
        l=(TextView) findViewById(R.id.textViewFETS);
        ls=(Button)findViewById(R.id.buttonFET);
        m=(TextView) findViewById(R.id.textViewCHEM10S);
        ms=(Button)findViewById(R.id.buttonCHEM10);
        n=(TextView) findViewById(R.id.textViewMM8S);
        ns=(Button)findViewById(R.id.buttonMM8);
        o=(TextView) findViewById(R.id.textViewMM2S);
        os=(Button)findViewById(R.id.buttonMM2);
        p=(TextView) findViewById(R.id.textViewME12S);
        ps=(Button)findViewById(R.id.buttonME12);
        q=(TextView) findViewById(R.id.textViewMG3S);
        qs=(Button)findViewById(R.id.buttonMG3);
        r=(TextView) findViewById(R.id.textViewMG4S);
        rs=(Button)findViewById(R.id.buttonMG4);
        s=(TextView) findViewById(R.id.textViewMTHE406S);
        ss=(Button)findViewById(R.id.buttonMTHE406);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Textbooks");
        getdata();

    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("APSC111").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                if(a1.equals("0")){as.setVisibility(View.GONE);}
                String b1=snapshot.child("APSC112").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                if(b1.equals("0")){bs.setVisibility(View.GONE);}
                String c1=snapshot.child("Calc6th").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                if(c1.equals("0")){cs.setVisibility(View.GONE);}
                String d1=snapshot.child("Calc7th").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                if(d1.equals("0")){ds.setVisibility(View.GONE);}
                String e1=snapshot.child("PhysicalGeo").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                if(e1.equals("0")){es.setVisibility(View.GONE);}
                String f1=snapshot.child("ELEC221").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                if(f1.equals("0")){fs.setVisibility(View.GONE);}
                String g1=snapshot.child("EngEcon2").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                if(g1.equals("0")){gs.setVisibility(View.GONE);}
                String h1=snapshot.child("EngEcon4").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                if(h1.equals("0")){hs.setVisibility(View.GONE);}
                String i1=snapshot.child("FluidMech").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                if(i1.equals("0")){is.setVisibility(View.GONE);}
                String j1=snapshot.child("Fluids341").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                if(j1.equals("0")){js.setVisibility(View.GONE);}
                String k1=snapshot.child("ComplexAnalysis").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                if(k1.equals("0")){ks.setVisibility(View.GONE);}
                String l1=snapshot.child("EngThermo").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);
                if(l1.equals("0")){ls.setVisibility(View.GONE);}
                String m1=snapshot.child("GenChem10").child("Stock").getValue().toString();
                m.setText("Stock:  "+m1);
                if(m1.equals("0")){ms.setVisibility(View.GONE);}
                String n1=snapshot.child("MechMat").child("Stock").getValue().toString();
                n.setText("Stock:  "+n1);
                if(n1.equals("0")){ns.setVisibility(View.GONE);}
                String o1=snapshot.child("MemMgt2").child("Stock").getValue().toString();
                o.setText("Stock:  "+o1);
                if(o1.equals("0")){os.setVisibility(View.GONE);}
                String p1=snapshot.child("Microecon12").child("Stock").getValue().toString();
                p.setText("Stock:  "+p1);
                if(p1.equals("0")){ps.setVisibility(View.GONE);}
                String q1=snapshot.child("Graphics3").child("Stock").getValue().toString();
                q.setText("Stock:  "+q1);
                if(q1.equals("0")){qs.setVisibility(View.GONE);}
                String r1=snapshot.child("Graphics4").child("Stock").getValue().toString();
                r.setText("Stock:  "+r1);
                if(r1.equals("0")){rs.setVisibility(View.GONE);}
                String s1=snapshot.child("MTHE406").child("Stock").getValue().toString();
                s.setText("Stock:  "+s1);
                if(s1.equals("0")){ss.setVisibility(View.GONE);}



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentTextbookList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void atc111Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atc111Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atc112Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atc112Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcCalc6Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcCalc6Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcCalc7Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcCalc7Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcGeo4Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcGeo4Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcELEC221Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcELEC221Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcEE2Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcEE2Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcEE4Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcEE4Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcFLMText(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcFLMText = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcF341Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcF341Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcFCAText(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcFCAText = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcFETText(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcFETText = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcCHEM10Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcCHEM10Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcMM8Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcMM8Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcMM2Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcMM2Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcME12Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcME12Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcMG3Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcMG3Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcMG4Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcMG4Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void atcMTHE406Text(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentTextbookList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.atcMTHE406Text = true;
        }
        else{
            Toast.makeText(StudentTextbookList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }






    public void shopCart(View v){
        Intent a = new Intent(this, StudentCart.class);
        startActivity(a);
    }

}