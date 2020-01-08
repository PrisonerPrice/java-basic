package io.ascending.training.lambda;

import java.util.Optional;

class USB {
    String version;
    Channel channel_1;
    Channel channel_2;

    USB(){
        this.version = "default";
    }

    public String getVersion() {
        return version;
    }

    public Optional<Channel> getChannel_1(){
        return Optional.ofNullable(this.channel_1);
    }

    public Channel getChannel_2(){
        return this.channel_2;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setChannel_1(Channel channel_1) {
        this.channel_1 = channel_1;
    }

    public void setChannel_2(Channel channel_2) {
        this.channel_2 = channel_2;
    }
}
