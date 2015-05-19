package com.example.ro.pub.cs.systems.pdsd.practicaltest2;

import java.io.IOException;
import java.net.ServerSocket;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class PracticalTest02MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test02_main);
/*        
        try {
    	  serverSocket = new ServerSocket(port);
    	} catch (IOException ioException) {
    	  Log.e(Constants.TAG, "An exception has occurred: " + ioException.getMessage());
    	  if (Constants.DEBUG) {
    	    ioException.printStackTrace();
    	  }
    	}
    	*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test02_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
 /*   
    private class ConnectButtonClickListener implements Button.OnClickListener {
	  public void onClick(View view) {
	    String serverPort = serverPortEditText.getText().toString();
	    if (serverPort == null || serverPort.isEmpty()) {
	      Toast.makeText(
	        getApplicationContext(),
	        "Server port should be filled!",
	        Toast.LENGTH_SHORT
	      ).show();
	      return;
	    }
	    serverThread = new ServerThread(Integer.parseInt(serverPort));
	    if (serverThread.getServerSocket() != null) {
	      serverThread.start();
	    } else {
	      Log.e("error", "[MAIN ACTIVITY] Could not creat server thread!");
	    }
	  }
	}
    
    private class ServerThread extends Thread {
    	 
    	@Override
    	public void run() {
    	  try {
    	    socket = new Socket(address, port);
    	    if (socket == null) {
    	      Log.e(Constants.TAG, "[CLIENT THREAD] Could not create socket!");
    	      return;
    	    }
    	    BufferedReader bufferedReader = Utilities.getReader(socket);
    	    PrintWriter    printWriter    = Utilities.getWriter(socket);
    	    if (bufferedReader != null && printWriter != null) {
    	      printWriter.println(city);
    	      printWriter.flush();
    	      printWriter.println(informationType);
    	      printWriter.flush();
    	      String weatherInformation;
    	      while ((weatherInformation = bufferedReader.readLine()) != null) {
    	        final String finalizedWeatherInformation = weatherInformation;
    	        weatherForecastTextView.post(new Runnable() {
    	          @Override
    	          public void run() {
    	            weatherForecastTextView.append(finalizedWeatherInformation + "\n");
    	          }
    	        });
    	      }
    	    } else {
    	      Log.e(Constants.TAG, "[CLIENT THREAD] BufferedReader / PrintWriter are null!");
    	    }
    	    socket.close();
    	  } catch (IOException ioException) {
    	    Log.e(Constants.TAG, "[CLIENT THREAD] An exception has occurred: " + ioException.getMessage());
    	    if (Constants.DEBUG) {
    	      ioException.printStackTrace();
    	    }
    	  }
    	}
    	}
    	*/
}
