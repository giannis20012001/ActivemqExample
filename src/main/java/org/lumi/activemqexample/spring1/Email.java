package org.lumi.activemqexample.spring1;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 7/7/2017.
 */

public class Email {
    public String getTo() {
        return to;

    }

    public void setTo(String to) {
        this.to = to;

    }

    public String getBody() {
        return body;

    }

    public void setBody(String body) {
        this.body = body;

    }

    public Email(String to, String body) {
        this.to = to;
        this.body = body;

    }

    public Email() {
        //Do nothing

    }

    private String to;
    private String body;
}
