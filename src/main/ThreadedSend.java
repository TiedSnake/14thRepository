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
public class ThreadedSend extends Thread
{
    private String msg;
    private Thread t;
    Sender sender;
    ThreadedSend(String m, Sender obj)
    {
        msg = m;
        sender=obj;
    }
    public void run()
    {
        synchronized(sender)
        {
            sender.send(msg);
        }
    }
}
