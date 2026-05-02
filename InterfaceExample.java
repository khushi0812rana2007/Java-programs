interface Click {
    void capturePicture();
    void captureVideo();
}

class Mobile implements Click {
    public void capturePicture() {
        System.out.println("Picture clicked");
    }

    public void captureVideo() {
        System.out.println("Video captured");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.capturePicture();
        m.captureVideo();
    }
}
