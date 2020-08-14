package kr.co.song1126.otherapi_test01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    //봉사활동 장소 정보 리스트로 저장
    ArrayList<TestItems> items=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_main);

        prepArray();
        Log.e("TestItems", items.get(50).address);


    }

    void prepArray(){


        try {
            CSVReader reader = new CSVReader(new InputStreamReader(getResources().openRawResource(R.raw.kr_volunteer_201907)));

            String[] nextLine;

            int num=0;
            while ((nextLine = reader.readNext())!=null){
                Log.e("asdffdsadfsa", nextLine[0]+nextLine[1]+nextLine[2]+nextLine[3]+nextLine[4]+nextLine[5]);
                Log.e("asdffdsadfsa", nextLine.length+"");
                items.add(new TestItems(
                        num,
                        nextLine[0],
                        nextLine[1],
                        nextLine[2],
                        nextLine[3],
                        nextLine[4],
                        nextLine[5]
                ));
                num++;
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }


    }
}
