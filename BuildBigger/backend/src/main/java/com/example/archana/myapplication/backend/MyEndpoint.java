/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.archana.myapplication.backend;

import com.example.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import sun.rmi.runtime.Log;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.archana.example.com",
                ownerName = "backend.myapplication.archana.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(){
        MyBean myBean = new MyBean();
        myBean.setData(Jokes.LetsLaugh());
        return myBean;
    }
}