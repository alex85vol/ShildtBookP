package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class ErrorMsg {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
// возвратить объект типа String в виде сообщения об ошибке
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
