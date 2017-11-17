/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class HashTable 
{
    private String[] hashTable;  //this is our array that holds all the words.
    private int mySize;
    
    public HashTable(int size)
    {
        //initialize table
        hashTable = new String [size]; 
        mySize = size;
    }
     
    public void addToHash(String input)
    {
        int hashValue = input.hashCode();     //this gives the hash code        
        hashValue = Math.abs(hashValue);       // makes the number ablsolute
        int finalPos = hashValue%mySize;      //This will modulo final position by size of array.         
        hashTable[finalPos] = input;         //doesnt take care of collisions. it will overwrite the old value with new if that happens.
    }
    
    public String compareFunction(String userValue)
    {
        //compare user value to hash table using a loop.
        String results = "";
        for (int i = 0; i < mySize; i++)
        {
            if(userValue.equals(hashTable[i]))
            {
              results = "Your word was FOUND in the hash table!";
            }
            else
            {
              results = "Your word was NOT FOUND in the hash table, try another word.";
            }
        }
        return results;
    }
    
    /*public void printOut()
    {
        for(int i = 0; i < mySize ; i++)
        {
            System.out.println(hashTable[i]);         //print every value we find. 
        }
    }*/
}
