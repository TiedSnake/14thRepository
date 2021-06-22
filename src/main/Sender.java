/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t" +msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" +msg+ " Sent");
    }
}
