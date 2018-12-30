package com.example.btimplementationtry2;

import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    final BluetoothManager bluetoothManager =
            (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
    public BluetoothAdapter mBluetoothAdapter = bluetoothManager.getAdapter();

    if(mBluetoothAdapter==null||!mBluetoothAdapter.isEnabled()){
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
    }

    public class DeviceScanActivity extends ListActivity {
        private BluetoothAdapter mBluetoothAdapter;
        private boolean mScanning;
        private Handler mhandler;

        private static final long SCAN_PERIOD = 10000;

        private void scanLeDevice(final boolean enable){
            if(enable){

            }
        }
    }
    void onServiceConnected(int profile, BluetoothProfile proxy){
    }

    void onServiceDisconnected(int profile){

    }
}
