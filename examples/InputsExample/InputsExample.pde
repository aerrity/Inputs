/*
 * Keyboard input demo
 * v0.3
 * Andrew Errity 1/10/15
 */
import iadt.creative.Inputs;

String stringInput = Inputs.readString("Enter a string");
println("String input: " + stringInput);

byte byteInput = Inputs.readByte("Enter a byte");
println("Byte input: " + byteInput);

short shortInput = Inputs.readShort("Enter a short");
println("Short input: " + shortInput);

int intInput = Inputs.readInt("Enter an integer");
println("Integer input: " + intInput);

long longInput = Inputs.readLong("Enter a long");
println("Long input: " + longInput);

float floatInput = Inputs.readFloat("Enter a float");
println("Float input: " + floatInput);

double doubleInput = Inputs.readDouble("Enter a double");
println("Double input: " + doubleInput);

boolean boolInput = Inputs.readBoolean("Pick Yes/No"); 
println("Boolean input: " + boolInput);










