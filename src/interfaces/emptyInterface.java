package interfaces;

public class emptyInterface {

}
/*
. An Interface Can Be Empty and Is Known as a Marker or Tagged Interface
Explanation:
An interface with no method declarations is known as a marker or tagged interface. These interfaces do not define any behaviors but serve to mark or identify a class as eligible for special processing. This can influence how objects of these classes are handled by other parts of your application or by Java itself.

Example:
*/
interface Serializable {
}

class Employee implements Serializable {
    // Class details
}
