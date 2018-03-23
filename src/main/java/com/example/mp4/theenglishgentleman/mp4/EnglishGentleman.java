package com.example.mp4.theenglishgentleman.mp4;


import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Monocle monocle;
    private Lighter lighter;
    private boolean heHadSmoked;
    private boolean heHadRead;

    public EnglishGentleman(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public void read(Newspaper newspaper){
        monocle.read(newspaper);
        heHadRead = true;
    }
    public void smoke(Cigar cigar){
        lighter.light(cigar);
        cigar.smoke();
        heHadSmoked = true;
    }

    public boolean hadAgoodDay() {
        return heHadRead && heHadSmoked;
    }

}
