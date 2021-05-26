package by.artezio.saladkou.stuctural.facade;

public class Dispatcher {

    public boolean checkIsAvailable(String good) {
        //complicated logic
        //send request to storage -> concrete storage department -> concrete employee
        //if no good at storage send request to provider
        //and so on...
        return true;
    }
}
