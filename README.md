# compositionOrExtends

A tartalmazás (composition) gyakran előnyösebb lehet az öröklődéssel (inheritance) szemben a következő okok miatt:

Flekszibilitás és kódújrafelhasználás: A tartalmazás lehetővé teszi, hogy osztályaid könnyebben cserélhetők legyenek, mivel a viselkedést és tulajdonságokat külön osztályokban definiálod. Ez növeli a kódújrafelhasználhatóságot és csökkenti a kódhoz való kötődést.

Kapcsolat lazítása: A tartalmazás segít a szorosabb kapcsolatok elkerülésében azáltal, hogy az osztályokat kisebb részegységekre bontja, amelyek kevésbé függnek egymástól. Ez növeli a rugalmasságot és az alkalmazás átláthatóságát.

Készíthetők konkrét osztályok helyett interfészek: A tartalmazás lehetővé teszi az interfészek használatát az öröklődéssel szemben, ami növeli a kód felhasználhatóságát és könnyebben kezelhetővé teszi az osztályokat.

Problémák kerülése a "másodlagos" öröklődésnél: Az öröklődés használatakor gyakran problémákat okozhat a "másodlagos" öröklődés, amikor egy osztály örököli egy másik osztályt csak azért, hogy hozzáférjen valamilyen viselkedéshez vagy tulajdonsághoz, ami nem illik a szándékolt hierarchiába.

Több típusú kapcsolat megvalósítása: A tartalmazás lehetővé teszi a több típusú kapcsolat megvalósítását egy osztályban, ami rugalmasabb és általánosabb kialakítást eredményezhet.

Összességében a tartalmazás segít elkerülni az öröklődés korlátait és a szorosabb kapcsolatokat, ami tisztább, rugalmasabb és könnyebben karbantartható kódot eredményezhet. Az öröklődés továbbra is fontos eszköz lehet bizonyos helyzetekben, de érdemes alaposan megfontolni, hogy a tartalmazás hogyan javíthatja a kód tervezését és struktúráját.
