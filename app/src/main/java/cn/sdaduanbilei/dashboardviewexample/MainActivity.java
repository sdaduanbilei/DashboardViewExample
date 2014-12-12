package cn.sdaduanbilei.dashboardviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import cn.sdaduanbilei.library.DashboardView;


public class MainActivity extends ActionBarActivity {

    DashboardView mDashoardView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDashoardView = (DashboardView) findViewById(R.id.dash_view);


        mDashoardView.setDashProgress(20);//设置进度
        mDashoardView.setDashTitle("0 km/h"); // 设置dashview 的title
        mDashoardView.setDashTitleColor(getResources().getColor(R.color.downy)); // title 颜色
//        mDashoardView.setDashTitleSize(12); title 大小
        mDashoardView.setDasProColor(getResources().getColor(R.color.downy));// 设置进度条的宽度
//        mDashoardView.setDashProWidth(16); 设置进度条的宽度
        mDashoardView.setDashColor(getResources().getColor(R.color.white_dash));// 设置底部圆环颜色
//        mDashoardView.setDashWidth(8);    设置底部圆环的宽度
        mDashoardView.setDashIcon(R.drawable.ic_bike); // 设置dashboard中间的图标
        mDashoardView.setDashProMax(100);//设置dashboard 的最大值

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
