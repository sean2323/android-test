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
		
		//�Ыؤ@�ӿ�t��?? �n��@�H�U��k
		adapter=new BaseAdapter(){

			@Override
			//�n�إߦh�֦�
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

			/*�[�J�C�@��|�۰ʨϥγo�Ӥ�k
			 * position ��e��id
			 * convertView??
			 * parent??
			*/
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				LayoutInflater inflater=getLayoutInflater();
				
				RelativeLayout layout=(RelativeLayout)
						inflater.inflate(R.layout.activity_main, null);
				//��o�C�� ���olayout�̭�����
				tv=(TextView)layout.findViewById(R.id.textView1);
				tv.setText("title"+position);
			
				return layout;
			}
			
		};
		list.setAdapter(adapter);
		/*
		 * ���I�޲��A�L�O���olayout�̪�textview
		 * �]�N�O��list�C�@�泣�O�@��layout�̪�textview
		 */
		        
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
