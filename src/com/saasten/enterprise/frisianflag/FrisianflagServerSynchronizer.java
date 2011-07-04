package com.saasten.enterprise.frisianflag;

import java.util.HashMap;

import com.sforce.soap.enterprise.EnterpriseConnection;

public class FrisianflagServerSynchronizer {
  public FrisianflagServerSynchronizer(){ }
  
  // I need these fields to run
  EnterpriseConnection entConnection;
  
  private void help() {
    StringBuilder help = new StringBuilder();
    help.append("FrisianFlag Server Synchronizer: ");
    help.append("\n");
    help.append("Usage : [xml configuration file] [option]");
    help.append("\n");
    help.append("Option: ");
    help.append("\n");
    help.append("\t a Synchronize local database from salesforce");
    help.append("\n");
    help.append("\t b Synchronize salesforce from localdatabase");
    help.append("\n");
    help.append("\t c Pull data from external server to local server");
    help.append("\n");
    help.append("\t d Push data from local server to external server");
    help.append("\n");
    
    System.out.println(help.toString());
  }
  
  public static void main(String[] args){
    FrisianflagServerSynchronizer ff = new FrisianflagServerSynchronizer();
    
    if(args.length < 2){
      // Test wether user give user configuration number
      ff.help();
      System.exit(-1);
    } else {
      //HashMap credential = 
    }
    // End test user input
  }


  

}
