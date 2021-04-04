package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class StudentCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cart);

        LinearLayout APSC111Text=(LinearLayout)findViewById(R.id.LLapsc111);
        if (inCart.atc111Text==true){
            APSC111Text.setVisibility(View.VISIBLE);
        }
        Button APSC111TextB=(Button) findViewById(R.id.buttonAPSC111);
        APSC111TextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atc111Text=false;
                APSC111Text.setVisibility(View.GONE);
            }
        });

        LinearLayout APSC112Text=(LinearLayout)findViewById(R.id.LLapsc112);
        if (inCart.atc112Text==true){
            APSC112Text.setVisibility(View.VISIBLE);
        }
        Button APSC112B=(Button) findViewById(R.id.buttonAPSC112);
        APSC112B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atc112Text=false;
                APSC112Text.setVisibility(View.GONE);
            }
        });
        LinearLayout Calc6Text=(LinearLayout)findViewById(R.id.LLCalc6T);
        if (inCart.atcCalc6Text==true){
            Calc6Text.setVisibility(View.VISIBLE);
        }
        Button Calc6B=(Button) findViewById(R.id.buttonCALC6);
        Calc6B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcCalc6Text=false;
                Calc6Text.setVisibility(View.GONE);
            }
        });

        LinearLayout Calc7Text=(LinearLayout)findViewById(R.id.LLCalc7T);
        if (inCart.atcCalc7Text==true){
            Calc7Text.setVisibility(View.VISIBLE);
        }
        Button Calc7B=(Button) findViewById(R.id.buttonCALC7);
        Calc7B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcCalc7Text=false;
                Calc7Text.setVisibility(View.GONE);
            }
        });

        LinearLayout Geo4Text=(LinearLayout)findViewById(R.id.LLGeo4);
        if (inCart.atcGeo4Text==true){
            Geo4Text.setVisibility(View.VISIBLE);
        }
        Button Geo4B=(Button) findViewById(R.id.buttonGEO4);
        Geo4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcGeo4Text=false;
                Geo4Text.setVisibility(View.GONE);
            }
        });

        LinearLayout ELEC221Text=(LinearLayout)findViewById(R.id.LLELEC221);
        if (inCart.atcELEC221Text==true){
            ELEC221Text.setVisibility(View.VISIBLE);
        }
        Button ELEC221B=(Button) findViewById(R.id.buttonELEC221);
        ELEC221B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcELEC221Text=false;
                ELEC221Text.setVisibility(View.GONE);
            }
        });

        LinearLayout EE2Text=(LinearLayout)findViewById(R.id.LLEE2);
        if (inCart.atcEE2Text==true){
            EE2Text.setVisibility(View.VISIBLE);
        }
        Button EE2B=(Button) findViewById(R.id.buttonEE2);
        EE2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcEE2Text=false;
                EE2Text.setVisibility(View.GONE);
            }
        });

        LinearLayout EE4Text=(LinearLayout)findViewById(R.id.LLEE4);
        if (inCart.atcEE4Text==true){
            EE4Text.setVisibility(View.VISIBLE);
        }
        Button EE4B=(Button) findViewById(R.id.buttonEE4);
        EE4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcEE4Text=false;
                EE4Text.setVisibility(View.GONE);
            }
        });

        LinearLayout FLMText=(LinearLayout)findViewById(R.id.LLFLM);
        if (inCart.atcFLMText==true){
            FLMText.setVisibility(View.VISIBLE);
        }
        Button FLMB=(Button) findViewById(R.id.buttonFLM);
        FLMB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcFLMText=false;
                FLMText.setVisibility(View.GONE);
            }
        });

        LinearLayout F341Text=(LinearLayout)findViewById(R.id.LLF341);
        if (inCart.atcF341Text==true){
            F341Text.setVisibility(View.VISIBLE);
        }
        Button F341B=(Button) findViewById(R.id.buttonF341);
        F341B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcF341Text=false;
                F341Text.setVisibility(View.GONE);
            }
        });

        LinearLayout FCAText=(LinearLayout)findViewById(R.id.LLFCA);
        if (inCart.atcFCAText==true){
            FCAText.setVisibility(View.VISIBLE);
        }
        Button FCAB=(Button) findViewById(R.id.buttonFCA);
        FCAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcFCAText=false;
                FCAText.setVisibility(View.GONE);
            }
        });

        LinearLayout FETText=(LinearLayout)findViewById(R.id.LLFET);
        if (inCart.atcFETText==true){
            FETText.setVisibility(View.VISIBLE);
        }
        Button FETB=(Button) findViewById(R.id.buttonFET);
        FETB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcFETText=false;
                FETText.setVisibility(View.GONE);
            }
        });

        LinearLayout CHEM10Text=(LinearLayout)findViewById(R.id.LLCHEM10);
        if (inCart.atcCHEM10Text==true){
            CHEM10Text.setVisibility(View.VISIBLE);
        }
        Button CHEM10B=(Button) findViewById(R.id.buttonCHEM10);
        CHEM10B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcCHEM10Text=false;
                CHEM10Text.setVisibility(View.GONE);
            }
        });

        LinearLayout MM8Text=(LinearLayout)findViewById(R.id.LLMM8);
        if (inCart.atcMM8Text==true){
            MM8Text.setVisibility(View.VISIBLE);
        }
        Button MM8B=(Button) findViewById(R.id.buttonMM8);
        MM8B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcMM8Text=false;
                MM8Text.setVisibility(View.GONE);
            }
        });

        LinearLayout MM2Text=(LinearLayout)findViewById(R.id.LLMM2);
        if (inCart.atcMM2Text==true){
            MM2Text.setVisibility(View.VISIBLE);
        }
        Button MM2B=(Button) findViewById(R.id.buttonMM2);
        MM2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcMM2Text=false;
                MM2Text.setVisibility(View.GONE);
            }
        });

        LinearLayout ME12Text=(LinearLayout)findViewById(R.id.LLME12);
        if (inCart.atcME12Text==true){
            ME12Text.setVisibility(View.VISIBLE);
        }
        Button ME12B=(Button) findViewById(R.id.buttonME12);
        ME12B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcME12Text=false;
                ME12Text.setVisibility(View.GONE);
            }
        });

        LinearLayout MG3Text=(LinearLayout)findViewById(R.id.LLMG3);
        if (inCart.atcMG3Text==true){
            MG3Text.setVisibility(View.VISIBLE);
        }
        Button MG3B=(Button) findViewById(R.id.buttonMG3);
        MG3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcMG3Text=false;
                MG3Text.setVisibility(View.GONE);
            }
        });
        
        LinearLayout MG4Text=(LinearLayout)findViewById(R.id.LLMG4);
        if (inCart.atcMG4Text==true){
            MG4Text.setVisibility(View.VISIBLE);
        }
        Button MG4B=(Button) findViewById(R.id.buttonMG4);
        MG4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcMG4Text=false;
                MG4Text.setVisibility(View.GONE);
            }
        });

        LinearLayout MTHE406Text=(LinearLayout)findViewById(R.id.LLMTHE406);
        if (inCart.atcMTHE406Text==true){
            MTHE406Text.setVisibility(View.VISIBLE);
        }
        Button MTHE406B=(Button) findViewById(R.id.buttonMTHE406);
        MTHE406B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.atcMTHE406Text=false;
                MTHE406Text.setVisibility(View.GONE);
            }
        });



        LinearLayout bp=(LinearLayout)findViewById(R.id.LLbp);
        if (inCart.bp==true){
            bp.setVisibility(View.VISIBLE);
        }
        Button bpB=(Button) findViewById(R.id.buttonBP);
        bpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.bp=false;
                bp.setVisibility(View.GONE);
            }
        });

        LinearLayout hp=(LinearLayout)findViewById(R.id.LLhp);
        if (inCart.hp==true){
            hp.setVisibility(View.VISIBLE);
        }
        Button hpB=(Button) findViewById(R.id.buttonHP);
        hpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.hp=false;
                hp.setVisibility(View.GONE);
            }
        });

        LinearLayout LG=(LinearLayout)findViewById(R.id.LLLG);
        if (inCart.LG==true){
            LG.setVisibility(View.VISIBLE);
        }
        Button LGB=(Button) findViewById(R.id.buttonLG);
        LGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.LG=false;
                LG.setVisibility(View.GONE);
            }
        });

        LinearLayout MT=(LinearLayout)findViewById(R.id.LLMT);
        if (inCart.MT==true){
            MT.setVisibility(View.VISIBLE);
        }
        Button MTB=(Button) findViewById(R.id.buttonMT);
        MTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.MT=false;
                MT.setVisibility(View.GONE);
            }
        });

        LinearLayout P=(LinearLayout)findViewById(R.id.LLP);
        if (inCart.P==true){
            P.setVisibility(View.VISIBLE);
        }
        Button PB=(Button) findViewById(R.id.buttonP);
        PB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.P=false;
                P.setVisibility(View.GONE);
            }
        });

        LinearLayout SG=(LinearLayout)findViewById(R.id.LLSG);
        if (inCart.SG==true){
            SG.setVisibility(View.VISIBLE);
        }
        Button SGB=(Button) findViewById(R.id.buttonSG);
        SGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.SG=false;
                SG.setVisibility(View.GONE);
            }
        });

        LinearLayout SCI=(LinearLayout)findViewById(R.id.LLSCI);
        if (inCart.SCI==true){
            SCI.setVisibility(View.VISIBLE);
        }
        Button SCIB=(Button) findViewById(R.id.buttonSCI);
        SCIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.SCI=false;
                SCI.setVisibility(View.GONE);
            }
        });

        LinearLayout STAP=(LinearLayout)findViewById(R.id.LLSTAP);
        if (inCart.STAP==true){
            STAP.setVisibility(View.VISIBLE);
        }
        Button STAPB=(Button) findViewById(R.id.buttonSTAP);
        STAPB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.STAP=false;
                STAP.setVisibility(View.GONE);
            }
        });

        LinearLayout STICK=(LinearLayout)findViewById(R.id.LLSTICK);
        if (inCart.STICK==true){
            STICK.setVisibility(View.VISIBLE);
        }
        Button STICKB=(Button) findViewById(R.id.buttonSTICK);
        STICKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.STICK=false;
                STICK.setVisibility(View.GONE);
            }
        });

        LinearLayout TAPE=(LinearLayout)findViewById(R.id.LLTAPE);
        if (inCart.TAPE==true){
            TAPE.setVisibility(View.VISIBLE);
        }
        Button TAPEB=(Button) findViewById(R.id.buttonTAPE);
        TAPEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.TAPE=false;
                TAPE.setVisibility(View.GONE);
            }
        });

        LinearLayout WBM=(LinearLayout)findViewById(R.id.LLWBM);
        if (inCart.WBM==true){
            WBM.setVisibility(View.VISIBLE);
        }
        Button WBMB=(Button) findViewById(R.id.buttonWBM);
        WBMB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.WBM=false;
                WBM.setVisibility(View.GONE);
            }
        });

        LinearLayout WO=(LinearLayout)findViewById(R.id.LLWO);
        if (inCart.WO==true){
            WO.setVisibility(View.VISIBLE);
        }
        Button WOB=(Button) findViewById(R.id.buttonWO);
        WOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.WO=false;
                WO.setVisibility(View.GONE);
            }
        });


        LinearLayout ACERC=(LinearLayout)findViewById(R.id.LLACERC);
        if (inCart.ACERC==true){
            ACERC.setVisibility(View.VISIBLE);
        }
        Button ACERCB=(Button) findViewById(R.id.buttonACERC);
        ACERCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.ACERC=false;
                ACERC.setVisibility(View.GONE);
            }
        });

        LinearLayout ASUSC=(LinearLayout)findViewById(R.id.LLASUSC);
        if (inCart.ASUSC==true){
            ASUSC.setVisibility(View.VISIBLE);
        }
        Button ASUSCB=(Button) findViewById(R.id.buttonASUSC);
        ASUSCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.ASUSC=false;
                ASUSC.setVisibility(View.GONE);
            }
        });

        LinearLayout HDMI=(LinearLayout)findViewById(R.id.LLHDMI);
        if (inCart.HDMI==true){
            HDMI.setVisibility(View.VISIBLE);
        }
        Button HDMIB=(Button) findViewById(R.id.buttonHDMI);
        HDMIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.HDMI=false;
                HDMI.setVisibility(View.GONE);
            }
        });

        LinearLayout HDTOL=(LinearLayout)findViewById(R.id.LLHDTOL);
        if (inCart.HDTOL==true){
            HDTOL.setVisibility(View.VISIBLE);
        }
        Button HDTOLB=(Button) findViewById(R.id.buttonHDTOL);
        HDTOLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.HDTOL=false;
                HDTOL.setVisibility(View.GONE);
            }
        });

        LinearLayout HDTOUC=(LinearLayout)findViewById(R.id.LLHDTOUC);
        if (inCart.HDTOUC==true){
            HDTOUC.setVisibility(View.VISIBLE);
        }
        Button HDTOUCB=(Button) findViewById(R.id.buttonHDTOUC);
        HDTOUCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.HDTOUC=false;
                HDTOUC.setVisibility(View.GONE);
            }
        });

        LinearLayout IPC=(LinearLayout)findViewById(R.id.LLIPC);
        if (inCart.IPC==true){
            IPC.setVisibility(View.VISIBLE);
        }
        Button IPCB=(Button) findViewById(R.id.buttonIPC);
        IPCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.IPC=false;
                IPC.setVisibility(View.GONE);
            }
        });

        LinearLayout LENC=(LinearLayout)findViewById(R.id.LLLENC);
        if (inCart.LENC==true){
            LENC.setVisibility(View.VISIBLE);
        }
        Button LENCB=(Button) findViewById(R.id.buttonLENC);
        LENCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.LENC=false;
                LENC.setVisibility(View.GONE);
            }
        });

        LinearLayout MACC=(LinearLayout)findViewById(R.id.LLMACC);
        if (inCart.MACC==true){
            MACC.setVisibility(View.VISIBLE);
        }
        Button MACCB=(Button) findViewById(R.id.buttonMACC);
        MACCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.MACC=false;
                MACC.setVisibility(View.GONE);
            }
        });

        LinearLayout MICROU=(LinearLayout)findViewById(R.id.LLMICROU);
        if (inCart.MICROU==true){
            MICROU.setVisibility(View.VISIBLE);
        }
        Button MICROUB=(Button) findViewById(R.id.buttonMICROU);
        MICROUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.MICROU=false;
                MICROU.setVisibility(View.GONE);
            }
        });

        LinearLayout MOUS=(LinearLayout)findViewById(R.id.LLMOUS);
        if (inCart.MOUS==true){
            MOUS.setVisibility(View.VISIBLE);
        }
        Button MOUSB=(Button) findViewById(R.id.buttonMOUS);
        MOUSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.MOUS=false;
                MOUS.setVisibility(View.GONE);
            }
        });

        LinearLayout USBC=(LinearLayout)findViewById(R.id.LLUSBC);
        if (inCart.USBC==true){
            USBC.setVisibility(View.VISIBLE);
        }
        Button USBCB=(Button) findViewById(R.id.buttonUSBC);
        USBCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.USBC=false;
                USBC.setVisibility(View.GONE);
            }
        });

        LinearLayout USBTO35=(LinearLayout)findViewById(R.id.LLUSBTO35);
        if (inCart.USBTO35==true){
            USBTO35.setVisibility(View.VISIBLE);
        }
        Button USBTO35B=(Button) findViewById(R.id.buttonUSBTO35);
        USBTO35B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.USBTO35=false;
                USBTO35.setVisibility(View.GONE);
            }
        });

        LinearLayout VGA=(LinearLayout)findViewById(R.id.LLVGA);
        if (inCart.VGA==true){
            VGA.setVisibility(View.VISIBLE);
        }
        Button VGAB=(Button) findViewById(R.id.buttonVGA);
        VGAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.VGA=false;
                VGA.setVisibility(View.GONE);
            }
        });

        LinearLayout VGATOHD=(LinearLayout)findViewById(R.id.LLVGATOHD);
        if (inCart.VGATOHD==true){
            VGATOHD.setVisibility(View.VISIBLE);
        }
        Button VGATOHDB=(Button) findViewById(R.id.buttonVGATOHD);
        VGATOHDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.VGATOHD=false;
                VGATOHD.setVisibility(View.GONE);
            }
        });

        LinearLayout VGATOL=(LinearLayout)findViewById(R.id.LLVGATOL);
        if (inCart.VGATOL==true){
            VGATOL.setVisibility(View.VISIBLE);
        }
        Button VGATOLB=(Button) findViewById(R.id.buttonVGATOL);
        VGATOLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.VGATOL=false;
                VGATOL.setVisibility(View.GONE);
            }
        });

        LinearLayout CC111=(LinearLayout)findViewById(R.id.LLCC111);
        if (inCart.CC111==true){
            CC111.setVisibility(View.VISIBLE);
        }
        Button CC111B=(Button) findViewById(R.id.button111EXAM);
        CC111B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.CC111=false;
                CC111.setVisibility(View.GONE);
            }
        });

        LinearLayout CC112=(LinearLayout)findViewById(R.id.LLCC112);
        if (inCart.CC112==true){
            CC112.setVisibility(View.VISIBLE);
        }
        Button CC112B=(Button) findViewById(R.id.button112EXAM);
                CC112B.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        inCart.cartCounter=inCart.cartCounter-1;
                        inCart.CC112=false;
                        CC112.setVisibility(View.GONE);
                    }
                });

        LinearLayout CC131=(LinearLayout)findViewById(R.id.LLCC131);
        if (inCart.CC131==true){
            CC131.setVisibility(View.VISIBLE);
        }
        Button CC131B=(Button) findViewById(R.id.button131EXAM);
        CC131B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.CC131=false;
                CC131.setVisibility(View.GONE);
            }
        });

        LinearLayout CC132=(LinearLayout)findViewById(R.id.LLCC132);
        if (inCart.CC132==true){
            CC132.setVisibility(View.VISIBLE);
        }
        Button CC132B=(Button) findViewById(R.id.button132EXAM);
        CC132B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.CC132=false;
                CC132.setVisibility(View.GONE);
            }
        });

        LinearLayout CC172=(LinearLayout)findViewById(R.id.LLCC172);
        if (inCart.CC172==true){
            CC172.setVisibility(View.VISIBLE);
        }
        Button CC172B=(Button) findViewById(R.id.button172EXAM);
        CC172B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.CC172=false;
                CC172.setVisibility(View.GONE);
            }
        });

        LinearLayout M172=(LinearLayout)findViewById(R.id.LLM172);
        if (inCart.M172==true){
            M172.setVisibility(View.VISIBLE);
        }
        Button M172B=(Button) findViewById(R.id.button172MID);
        M172B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.M172=false;
                M172.setVisibility(View.GONE);
            }
        });

        LinearLayout CC174=(LinearLayout)findViewById(R.id.LLCC174);
        if (inCart.CC174==true){
            CC174.setVisibility(View.VISIBLE);
        }
        Button CC174B=(Button) findViewById(R.id.button174EXAM);
        CC174B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.CC174=false;
                CC174.setVisibility(View.GONE);
            }
        });

        LinearLayout ECON=(LinearLayout)findViewById(R.id.LLECON);
        if (inCart.ECON==true){
            ECON.setVisibility(View.VISIBLE);
        }
        Button ECONB=(Button) findViewById(R.id.buttonECON110112);
        ECONB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.ECON=false;
                ECON.setVisibility(View.GONE);
            }
        });

        LinearLayout WB2014=(LinearLayout)findViewById(R.id.LLWB2014);
        if (inCart.WB2014==true){
            WB2014.setVisibility(View.VISIBLE);
        }
        Button WB2014B=(Button) findViewById(R.id.button1112014);
        WB2014B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.WB2014=false;
                WB2014.setVisibility(View.GONE);
            }
        });

        LinearLayout WB2015=(LinearLayout)findViewById(R.id.LLWB2015);
        if (inCart.WB2015==true){
            WB2015.setVisibility(View.VISIBLE);
        }
        Button WB2015B=(Button) findViewById(R.id.button1112015);
        WB2015B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.WB2015=false;
                WB2015.setVisibility(View.GONE);
            }
        });

        LinearLayout MTHE225=(LinearLayout)findViewById(R.id.LLMTHE225);
        if (inCart.MTHE225==true){
            MTHE225.setVisibility(View.VISIBLE);
        }
        Button MTHE225B=(Button) findViewById(R.id.buttonMTHE225E);
        MTHE225B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inCart.cartCounter=inCart.cartCounter-1;
                inCart.MTHE225=false;
                MTHE225.setVisibility(View.GONE);
            }
        });

    }


    public void requestEquip(View v){
        Intent a = new Intent(this, StudentConfirmOrder.class);
        startActivity(a);
    }



}