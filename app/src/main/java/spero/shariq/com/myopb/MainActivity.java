package spero.shariq.com.myopb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText id;
    EditText dob;
    EditText age;
    EditText sex;
    EditText wt;
    EditText ht;
    EditText op;
    EditText dop;
    EditText sbp;
    EditText dbp;
    EditText hr;
    EditText loc;
    EditText anes;


    public static String NAME,DOB,SEX,OP,DOP,LOC,NRIC,ANES,CURRENTDATETIME,OP_LIST;
    public static int AGE,WT,HT,SBP,DBP,HR;
    public static double BMI;
    public static boolean INFECTION,GOOD_ET,LUNG_DS,EPILEPSY,CVA,LIVER_DS,RENAL_DS,THYROID_DS,DM,BLOOD_DS,
            IRREG_BEAT,CHEST_PAIN,IHD,SOB_REST,LOOSE_TEETH,PREGNANT,
            IsRedFlag,SMOKER,ALCOHOL_USE,HYPERTENSION,
            GASTRIC_ACID_REFLUX,F_H_O_ANAESTHESIA_REACTIONS,PREV_OP,
            PSYCHIATRIC_ILLNESS,JOINT_MUSCLE_DS,ALLERGY,PONV,TCM,
            HasDrugs,LOUD_SNORE,DAYTIME_TIREDNESS,APNEA_EPISODE,DENTAL_IMP,IsMouthOpen,IsNeckMov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AdminPgStartClick(View view) {

        //map EDITTEXTs
        name= (EditText)findViewById(R.id.NameofPat);
        id= (EditText)findViewById(R.id.IDofPat);
        dob= (EditText)findViewById(R.id.PtDob);
        age= (EditText)findViewById(R.id.PtAge);
        sex= (EditText)findViewById(R.id.PtGender);
        wt= (EditText)findViewById(R.id.PtWt);
        ht= (EditText)findViewById(R.id.PtHt);
        op= (EditText)findViewById(R.id.PtOp);
        dop= (EditText)findViewById(R.id.PtOpDate);
        sbp= (EditText)findViewById(R.id.PtSBP);
        dbp= (EditText)findViewById(R.id.PtDBP);
        hr= (EditText)findViewById(R.id.PtHR);
        loc= (EditText)findViewById(R.id.admitLoc);
        anes= (EditText)findViewById(R.id.Ptanes);



        //Static Data
        NAME=name.getText().toString();
        NRIC=id.getText().toString();
        DOB=dop.getText().toString();
        AGE=Integer.parseInt(age.getText().toString());
        SEX=sex.getText().toString();
        WT=Integer.parseInt(wt.getText().toString());
        HT=Integer.parseInt(ht.getText().toString());
        OP=op.getText().toString();
        DOP=dop.getText().toString();
        SBP=Integer.parseInt(sbp.getText().toString());
        DBP=Integer.parseInt(dbp.getText().toString());
        HR=Integer.parseInt(hr.getText().toString());
        LOC=loc.getText().toString();
        BMI= WT/(HT*0.01*HT*0.01);
        ANES=anes.getText().toString();
        CURRENTDATETIME= Calendar.getInstance().getTime().toString();
        OP_LIST="please get op list from system";
        IsRedFlag=false;
        IsMouthOpen=false;
        IsNeckMov = false;
        PREV_OP = false;
        GOOD_ET = false;
        INFECTION = true;




        //goto splash
        startActivity(new Intent(this, SplashPg.class));


    }
}
