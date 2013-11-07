package com.example.test1;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText edt1;
	private Button btn1;
	private int i;
	private ListView list;
	//private ArrayList<String> adapter;
	private List list1;
	private BaseAdapter adapter;
	private Object[] s1;
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list = (ListView)findViewById(R.id.listView1);
		
		//創建一個選配器?? 要實作以下方法
		adapter=new BaseAdapter(){

			@Override
			//要建立多少行
			public int getCount() {
				// TODO Auto-generated method stub
				return 10;
				//create 10 row
			}

			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				
				return null;
			}

			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				
				return 0;
			}

			/*加入每一行會自動使用這個方法
			 * position 當前的id
			 * convertView??
			 * parent??
			*/
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				LayoutInflater inflater=getLayoutInflater();
				
				RelativeLayout layout=(RelativeLayout)
						inflater.inflate(R.layout.activity_main, null);
				//獲得每行 取得layout裡面的值
				tv=(TextView)layout.findViewById(R.id.textView1);
				tv.setText("title"+position);
			
				return layout;
			}
			
		};
		list.setAdapter(adapter);
		/*
		 * 有點詭異，他是取得layout裡的textview
		 * 也就是說list每一行都是一個layout裡的textview
		 */
		        
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
