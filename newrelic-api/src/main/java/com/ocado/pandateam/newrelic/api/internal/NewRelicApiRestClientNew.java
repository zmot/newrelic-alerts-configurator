package com.ocado.pandateam.newrelic.api.internal;

import com.mashape.unirest.http.Unirest;

public class NewRelicApiRestClientNew {

    private final String hostUrl;
    private final String apiKey;

    public NewRelicApiRestClientNew(String hostUrl, String apiKey) {
        this.hostUrl = hostUrl;
        this.apiKey = apiKey;
        Unirest.setObjectMapper(new Mapper());
    }

    public NewRelicRequest get(String url) {
        return new NewRelicRequest(Unirest.get(hostUrl + url).header("X-Api-Key", apiKey));
    }

}
