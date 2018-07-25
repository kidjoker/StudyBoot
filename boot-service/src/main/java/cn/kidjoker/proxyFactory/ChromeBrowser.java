package cn.kidjoker.proxyFactory;

public class ChromeBrowser implements Browser {

    @Override
    public void visitInternet() {
        System.out.println("visit youTube");
    }

    @Override
    public void listenToMusic() {
        System.out.println("listen to Cranberries");
    }

    public String seeMovie(String movie) {
        System.out.println("see a movie: " + movie);
        return movie + " has been seen";
    }

}
