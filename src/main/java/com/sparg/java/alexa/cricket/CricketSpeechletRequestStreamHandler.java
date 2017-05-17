package com.sparg.java.alexa.cricket;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vimalniroshan on 6/7/16.
 */
public class CricketSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    private static final Logger log = LoggerFactory.getLogger(CricketSpeechletRequestStreamHandler.class);

    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds.add("amzn1.echo-sdk-ams.app.b0828e5b-9c8a-4b1c-a4ee-ccb0cea643a9");
    }

    public CricketSpeechletRequestStreamHandler() {
        super(new CricketSpeechlet(), supportedApplicationIds);
    }
}
