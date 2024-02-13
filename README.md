# compositionOrExtends

A tartalmazás (composition) gyakran előnyösebb lehet az öröklődéssel (inheritance) szemben a következő okok miatt:

**Flekszibilitás és kódújrafelhasználás**: A tartalmazás lehetővé teszi, hogy osztályaid könnyebben cserélhetők legyenek, mivel a viselkedést és tulajdonságokat külön osztályokban definiálod. Ez növeli a kódújrafelhasználhatóságot és csökkenti a kódhoz való kötődést.

**Kapcsolat lazítása**: A tartalmazás segít a szorosabb kapcsolatok elkerülésében azáltal, hogy az osztályokat kisebb részegységekre bontja, amelyek kevésbé függnek egymástól. Ez növeli a rugalmasságot és az alkalmazás átláthatóságát.
világosan látszanak a részek. Futásidőben is cserélhető tartalmazás esetén.
Származás esetén forításkor eldöl, nem lehet változtani.

**Készíthetők konkrét osztályok helyett interfészek**: A tartalmazás lehetővé teszi az interfészek használatát az öröklődéssel szemben, ami növeli a kód felhasználhatóságát és könnyebben kezelhetővé teszi az osztályokat.

Problémák kerülése a "másodlagos" öröklődésnél: Az öröklődés használatakor gyakran problémákat okozhat a "másodlagos" öröklődés, amikor egy osztály örököli egy másik osztályt csak azért, hogy hozzáférjen valamilyen viselkedéshez vagy tulajdonsághoz, ami nem illik a szándékolt hierarchiába.

**Több típusú kapcsolat megvalósítása**: _Nincs többszörös öröklödés!_ A tartalmazás lehetővé teszi a több típusú kapcsolat megvalósítását egy osztályban, ami rugalmasabb és általánosabb kialakítást eredményezhet.

Összességében a tartalmazás segít elkerülni az öröklődés korlátait és a szorosabb kapcsolatokat, ami tisztább, rugalmasabb és könnyebben karbantartható kódot eredményezhet. Az öröklődés továbbra is fontos eszköz lehet bizonyos helyzetekben, de érdemes alaposan megfontolni, hogy a tartalmazás hogyan javíthatja a kód tervezését és struktúráját.

Elöbb utóbb sértjük a SRP-t a származással.

pelda:

```java
// Alap interfész a kommunikációs eszközök számára
interface Communicator {
    void sendMessage(String message);
}

// Implementáció az e-mail küldéshez
class EmailCommunicator implements Communicator {
    @Override
    public void sendMessage(String message) {
        // E-mail küldési logika
        System.out.println("E-mail sent: " + message);
    }
}

// Implementáció az SMS küldéshez
class SMSCommunicator implements Communicator {
    @Override
    public void sendMessage(String message) {
        // SMS küldési logika
        System.out.println("SMS sent: " + message);
    }
}

// Felhasználó osztály, ami tartalmaz egy kommunikációs eszközt
class User {
    private Communicator communicator;

    // Konstruktor a kommunikációs eszköz beállításához
    public User(Communicator communicator) {
        this.communicator = communicator;
    }

    // Metódus üzenet küldésére
    public void sendMessage(String message) {
        communicator.sendMessage(message);
    }
}

// Tesztosztály
public class Main {
    public static void main(String[] args) {
        // E-mail kommunikátor használata
        Communicator emailCommunicator = new EmailCommunicator();
        User userWithEmail = new User(emailCommunicator);
        userWithEmail.sendMessage("Hello from email");

        // SMS kommunikátor használata
        Communicator smsCommunicator = new SMSCommunicator();
        User userWithSMS = new User(smsCommunicator);
        userWithSMS.sendMessage("Hello from SMS");
    }
}

```

# testing

Származás esetén mit teszteljünk? Mi a Unit?

## Kell unit teszt a Base-re?
**Ha igen**, akkor Spy-oljuk a tesztelendő osztály és adjunk teszt implementációt az 
absztrakt osztályra.

**Ha csak a példányosítható osztályt teszteljük**
akkor ha később módositanunk kell az ős implementációt, akkor baj van
Sonar nem fogadja el. Az új kód lefedettsége nem lesz meg.

Kompoziciónál nincs kérdés, világos mit is kell tesztelni.