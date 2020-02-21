package com.example.astrum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;

import static android.content.Context.MODE_PRIVATE;

public class ChooseSoundsMenu extends AppCompatActivity
{
    public static int PlanetsVal[] = new int[8];
    final Spinner Spinner[] = new Spinner[8];
    private SeekBar VolumeSeekbar[] = new SeekBar[8];
    static float VolumeVal[] = new float[8];


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_choose_sounds_menu);

        Spinner[0] = findViewById(R.id.SpinnerPlanet1);
        Spinner[1] = findViewById(R.id.SpinnerPlanet2);
        Spinner[2] = findViewById(R.id.spinnerPlanet3);
        Spinner[3] = findViewById(R.id.spinnerPlanet4);
        Spinner[4] = findViewById(R.id.spinnerPlanet5);
        Spinner[5] = findViewById(R.id.spinnerPlanet6);
        Spinner[6] = findViewById(R.id.spinnerPlanet7);
        Spinner[7] = findViewById(R.id.spinnerPlanet8);

        String list[] = new String[]{
                "Sound 1",
                "Sound 2",
                "Sound 3",
                "Sound 4",
                "Sound 5",
                "Sound 6",
                "No sound"
        };

        //Declare drop down menus
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_spinner_dropdown_item, list);

        //Set to drop down menus
        for (int i = 0; 8 > i; i++)
        {
            Spinner[i].setAdapter(adapter);
        }


//-------------------------------------------------------------------------------------------------
        Spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                //Create an int for the position
                PlanetsVal[0] = Spinner[0].getSelectedItemPosition();
                Log.d("MercuryLog", String.valueOf(Spinner[0].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref0 = getSharedPreferences("Mercury",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref0.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("MercuryKey", Spinner[0].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Venus value
        SharedPreferences sharedPref0 = getSharedPreferences("Venus",MODE_PRIVATE);
        int MercuryShared = sharedPref0.getInt("VenusKey", -1);
        if(MercuryShared != -1)
        {
            // set the selected value of the spinner
            Spinner[1].setSelection(MercuryShared);
        }

        initControl1();


//-------------------------------------------------------------------------------------------------
        Spinner[1].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                //Create an int for the position
                PlanetsVal[1] = Spinner[1].getSelectedItemPosition();
                Log.d("VenusLog", String.valueOf(Spinner[1].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref1 = getSharedPreferences("Venus",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref1.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("VenusKey", Spinner[1].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Venus value
        SharedPreferences sharedPref1 = getSharedPreferences("Venus",MODE_PRIVATE);
        int VenusShared = sharedPref1.getInt("VenusKey", -1);
        if(VenusShared != -1)
        {
            // set the selected value of the spinner
            Spinner[1].setSelection(VenusShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[2].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                //Create an int for the position
                PlanetsVal[2] = Spinner[2].getSelectedItemPosition();
                Log.d("EarthLog", String.valueOf(Spinner[2].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref2 = getSharedPreferences("Earth",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref2.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("EarthKey", Spinner[2].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Earth value
        SharedPreferences sharedPref2 = getSharedPreferences("Earth",MODE_PRIVATE);
        int EarthShared = sharedPref2.getInt("EarthKey", -1);
        if(EarthShared != -1)
        {
            // set the selected value of the spinner
            Spinner[2].setSelection(EarthShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[3].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PlanetsVal[3] = Spinner[3].getSelectedItemPosition();
                Log.d("MarsLog", String.valueOf(Spinner[3].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref3 = getSharedPreferences("Mars",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref3.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("MarsKey", Spinner[3].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Mars value
        SharedPreferences sharedPref3 = getSharedPreferences("Mars",MODE_PRIVATE);
        int MarsShared = sharedPref3.getInt("MarsKey", -1);
        if(MarsShared != -1)
        {
            // set the selected value of the spinner
            Spinner[3].setSelection(MarsShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[4].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PlanetsVal[4] = Spinner[4].getSelectedItemPosition();
                Log.d("JupiterLog", String.valueOf(Spinner[4].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref4 = getSharedPreferences("Jupiter",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref4.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("JupiterKey", Spinner[4].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Jupiter Value
        SharedPreferences sharedPref4 = getSharedPreferences("Jupiter",MODE_PRIVATE);
        int JupitergetShared = sharedPref4.getInt("JupiterKey", -1);
        if(JupitergetShared != -1)
        {
            // set the selected value of the spinner
            Spinner[4].setSelection(JupitergetShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[5].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PlanetsVal[5] = Spinner[5].getSelectedItemPosition();
                Log.d("SaturnLog", String.valueOf(Spinner[5].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref5 = getSharedPreferences("Saturn",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref5.edit();

                //Put it in to a key called NeptuneKey
                prefEditor.putInt("SaturnKey", Spinner[5].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Saturn value
        SharedPreferences sharedPref5 = getSharedPreferences("Saturn",MODE_PRIVATE);
        int SaturngetShared = sharedPref5.getInt("SaturnKey", -1);
        if(SaturngetShared != -1)
        {
            // set the selected value of the spinner
            Spinner[5].setSelection(SaturngetShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[6].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PlanetsVal[6] = Spinner[6].getSelectedItemPosition();
                Log.d("UranusLog", String.valueOf(Spinner[6].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref6 = getSharedPreferences("Uranus",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref6.edit();

                //Put it in to a key called NeptuneKey
                prefEditor.putInt("UranusKey", Spinner[6].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Uranus Value
        SharedPreferences sharedPref6 = getSharedPreferences("Uranus",MODE_PRIVATE);
        int UranusgetShared = sharedPref6.getInt("UranusKey", -1);
        if(UranusgetShared != -1)
        {
            // set the selected value of the spinner
            Spinner[6].setSelection(UranusgetShared);
        }
//-------------------------------------------------------------------------------------------------
        Spinner[7].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PlanetsVal[7] = Spinner[7].getSelectedItemPosition();
                Log.d("NeptuneLog", String.valueOf(Spinner[7].getSelectedItemPosition()));

                //Send it to sharedPref
                SharedPreferences sharedPref7 = getSharedPreferences("Neptune",MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sharedPref7.edit();

                //Put it in to a key called "somekey"
                prefEditor.putInt("NeptuneKey", Spinner[7].getSelectedItemPosition());
                prefEditor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //Load Neptune value
        SharedPreferences sharedPref7 = getSharedPreferences("Neptune",MODE_PRIVATE);
        int NeptunegetShared = sharedPref7.getInt("NeptuneKey", -1);
        if(NeptunegetShared != -1)
        {
            // set the selected value of the spinner
            Spinner[7].setSelection(NeptunegetShared);
        }
//-------------------------------------------------------------------------------------------------
    }//onCreate

    private void initControl1()
    {
        try
        {
            //for controlling volume
            VolumeSeekbar[0] = findViewById(R.id.seekBar1);
            VolumeSeekbar[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
            {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
                {
                    VolumeVal[0] = progress;
                    Log.d("Progress", "Value"+VolumeVal[0]);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar)
                {

                }
            });
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

}
