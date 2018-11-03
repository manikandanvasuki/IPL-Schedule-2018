package mahisarashyu.iplschedule21century;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class TeamDetails extends Fragment {

    String team_name;
    private AdView mAdMobAdView;
    private AdView mAdMobAdView_foot;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle saveInstacneState) {

        SharedPreferences sharedpreferences1 = getActivity().getSharedPreferences(exactTeam.MyPREFERENCES, 0);
        team_name = sharedpreferences1.getString("teamName", "");

        View rootview = inflater.inflate(R.layout.activity_team_details, container, false);

        mAdMobAdView = (AdView) rootview.findViewById(R.id.admob_adview_head);
        AdRequest adRequest = new AdRequest.Builder()
               .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
               .addTestDevice("574199C5F2808D4C0328F88E982E40D5")// Add your real device id here
                .build();
        mAdMobAdView.loadAd(adRequest);

        mAdMobAdView_foot = (AdView) rootview.findViewById(R.id.admob_adview_footer);
        AdRequest adRequestfoot = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("574199C5F2808D4C0328F88E982E40D5")// Add your real device id here
                .build();
        mAdMobAdView_foot.loadAd(adRequestfoot);

        ImageView imgvw = (ImageView) rootview.findViewById(R.id.details_imageview);
        TextView ownertxtvw=(TextView) rootview.findViewById(R.id.owner_circle);
        TextView captaintxtvw=(TextView) rootview.findViewById(R.id.captain_circle);
        TextView wintxtvw=(TextView) rootview.findViewById(R.id.win_circle);
        TextView hightottxtvw=(TextView) rootview.findViewById(R.id.highest_total);
        TextView lowtottxtvw=(TextView) rootview.findViewById(R.id.lowest_total);
        TextView mostrunstxtvw=(TextView) rootview.findViewById(R.id.most_runs);
        TextView mostwicktxtvw=(TextView) rootview.findViewById(R.id.most_wickets);
        TextView htotopptxtvw=(TextView) rootview.findViewById(R.id.highest_total_oppn);
        TextView ltotopptxtvw=(TextView) rootview.findViewById(R.id.lowest_total_oppn);
        TextView bestperipltxtvw=(TextView) rootview.findViewById(R.id.best_performance);

        Resources res=getResources();

        String rajasthan=res.getString(R.string.rajasthan_team);
        String mumbai="mumbai";
        String delhi="delhi";
        String bangalore="bangalore";
        String chennai="chennai";
        String hyderabad="hyderabad";
        String kolkata="kolkata";
        String punjab="punjab";

        Log.v("details", rajasthan);

        if(team_name.equalsIgnoreCase(rajasthan)){
            imgvw.setImageResource(R.drawable.rr_team);
            ownertxtvw.setText("Manoj Badale");
            captaintxtvw.setText("Ajinkya Rahane");
            wintxtvw.setText("50.86%");
            hightottxtvw.setText("223/5 vs Chennai Super Kings");
            lowtottxtvw.setText("58 vs Royal Challengers Bangalore");
            mostrunstxtvw.setText("Ajinkya Rahane - 3057");
            mostwicktxtvw.setText("Dhawal Kulkarni - 76");
            htotopptxtvw.setText("246/5 by Chennai Super Kings");
            ltotopptxtvw.setText("70 by RCB");
            bestperipltxtvw.setText("Champions - 2008");

        }


        else if(team_name.equalsIgnoreCase(mumbai))
        {
            imgvw.setImageResource(R.drawable.mi_team);
            ownertxtvw.setText("Reliance Industries");
            captaintxtvw.setText("Rohit Sharma");
            wintxtvw.setText("57.04%");
            hightottxtvw.setText("223/6 vs Kings XI Punjab");
            lowtottxtvw.setText("87/10 vs Kings XI Punjab");
            mostrunstxtvw.setText("Rohit Sharma - 4207");
            mostwicktxtvw.setText("Malinga - 154");
            htotopptxtvw.setText("235/1 by  Royal Challengers Bangalore");
            ltotopptxtvw.setText("67/10 by Kolkata Knight Riders");
            bestperipltxtvw.setText("Champions - 2013, 2015, 2017");
        }

        else if(team_name.equalsIgnoreCase(chennai))
        {
            imgvw.setImageResource(R.drawable.csk_team);
            ownertxtvw.setText("CSK Cricket Ltd");
            captaintxtvw.setText("MS Dhoni");
            wintxtvw.setText("59.84%");
            hightottxtvw.setText("246/5 vs Rajasthan Royals");
            lowtottxtvw.setText("79/10 vs Mumbai Indians");
            mostrunstxtvw.setText("Suresh Raina - 4098");
            mostwicktxtvw.setText("Dwayne Bravo - 122");
            htotopptxtvw.setText("231/4 by Kings XI Punjab");
            ltotopptxtvw.setText("83 by Delhi Daredevils");
            bestperipltxtvw.setText("Champions - 2010, 2011");
        }

        else if(team_name.equalsIgnoreCase(kolkata))
        {
            imgvw.setImageResource(R.drawable.kkr_team);
            ownertxtvw.setText("SR Khan, J.Chawla, J.Mehta");
            captaintxtvw.setText("Dinesh Karthik");
            wintxtvw.setText("52.02%");
            hightottxtvw.setText("222/3 vs Royal Challengers Bangalore");
            lowtottxtvw.setText("49/10 vs Mumbai Indians ");
            mostrunstxtvw.setText("Robin Uthappa - 3778");
            mostwicktxtvw.setText("Piyush Chawla - 126");
            htotopptxtvw.setText("209/3 by Sunrisers Hyderabad");
            ltotopptxtvw.setText("49/10 by Royal Challengers Bangalore");
            bestperipltxtvw.setText("Champions - 2012, 2014");
        }

        else if(team_name.equalsIgnoreCase(delhi))
        {
            imgvw.setImageResource(R.drawable.dd_team);
            ownertxtvw.setText("GMR Group");
            captaintxtvw.setText("Gautham Gambhir");
            wintxtvw.setText("43.66%");
            hightottxtvw.setText("231/4 vs Kings XI Punjab");
            lowtottxtvw.setText("66/10 vs Mumbai Indians");
            mostrunstxtvw.setText("Gautham Gambhir - 4133");
            mostwicktxtvw.setText("Amit Mishra - 134");
            htotopptxtvw.setText("225/5 by Chennai Super Kings");
            ltotopptxtvw.setText("92/10 by Mumbai Indians");
            bestperipltxtvw.setText("Playoffs - 2008, 2009, 2012");
        }

        else if(team_name.equalsIgnoreCase(bangalore))
        {
            imgvw.setImageResource(R.drawable.rcb);
            ownertxtvw.setText("United Spirits");
            captaintxtvw.setText("Virat Kohli");
            wintxtvw.setText("48.66%");
            hightottxtvw.setText("263/5 vs Pune Warriors India");
            lowtottxtvw.setText("49/10 vs KKR");
            mostrunstxtvw.setText("Virat Kohli - 4418");
            mostwicktxtvw.setText("Yuzvendra Chahal- 70");
            htotopptxtvw.setText("232/2 by Kings XI Punjab");
            ltotopptxtvw.setText("58/10 by Rajasthan Royals");
            bestperipltxtvw.setText("Runners up - 2009, 2011, 2016");
        }

        else if(team_name.equalsIgnoreCase(hyderabad))
        {
            imgvw.setImageResource(R.drawable.srh_team);
            ownertxtvw.setText("Sun Network");
            captaintxtvw.setText("Kane Williamson");
            wintxtvw.setText("54.71%");
            hightottxtvw.setText("209/3 vs SRH");
            lowtottxtvw.setText("113/10 vs Mumbai Indians");
            mostrunstxtvw.setText("Shikar Dhawan - 3561");
            mostwicktxtvw.setText("Bhuvneshwar Kumar - 111");
            htotopptxtvw.setText("227/4 by  Royal Challengers Bangalore");
            ltotopptxtvw.setText("80/10  Delhi Daredevils");
            bestperipltxtvw.setText("Champions - 2016");
        }

        else if(team_name.equalsIgnoreCase(punjab))
        {
            imgvw.setImageResource(R.drawable.kxip_team);
            ownertxtvw.setText("KPH Dream Cricket");
            captaintxtvw.setText("R Ashwin");
            wintxtvw.setText("47.3%");
            hightottxtvw.setText("232/2 vs Royal Challengers Bangalore");
            lowtottxtvw.setText("73/10 vs RPS");
            mostrunstxtvw.setText("Chris Gayle- 3626");
            mostwicktxtvw.setText("R Ashwin -100 ");
            htotopptxtvw.setText("240/5 by Chennai Super Kings");
            ltotopptxtvw.setText("67/10 by Delhi Daredevils");
            bestperipltxtvw.setText("Runners up - 2014");
        }

        return rootview;
    }
}