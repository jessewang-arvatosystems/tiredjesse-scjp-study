package two.modifiers;

public class NonAccessModifiers {}

// Legal NonAccessModifiers for outer-most classes
final class Final{}
abstract class Abstract{}
strictfp class StrictFloatingPoint{}

// Illegal NonAccessModifiers for outer-most classes
/*
final abstract class FinalAbstract{}
static class Static{}
volatile class Volatile{}
transient class Transient{}
synchronized class Synchronized{}
native class Native{}
*/