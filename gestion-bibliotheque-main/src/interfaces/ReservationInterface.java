package interfaces;



import Modele.Oeuvre;
import Modele.Reservation;
import Modele.Usager;
import Utility.BibalExceptions;
import java.util.ArrayList;
import java.util.Date;

public interface ReservationInterface {
    void reserver(Usager usager, Oeuvre oeuvre, Date dateJour) throws BibalExceptions;
    void annuler(Usager usager, Oeuvre oeuvre, Reservation reservation) throws BibalExceptions;
    Reservation findById(int id) throws BibalExceptions;
    ArrayList<Reservation> findByDateReservaton(Date dateRes) throws BibalExceptions;
    Reservation findByReservation(Usager usager, Oeuvre oeuvre) throws BibalExceptions;
    ArrayList<Reservation> findByReservation(Oeuvre oeuvre) throws BibalExceptions;
}
