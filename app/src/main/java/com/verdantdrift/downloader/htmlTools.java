package com.verdantdrift.downloader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Joe on 8/14/2015.
 */
public class htmlTools {

    public htmlTools() {

    }

    public void downloadHTML() throws Exception {

        URL url = new URL("http://news.bbc.co.uk");

        InputStream inputStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            //Log.d("JAM", line);
        }

    }
}
