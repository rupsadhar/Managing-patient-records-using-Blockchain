
import java.util.ArrayList;

import java.util.Date;



public class Block {

    private ArrayList<Record> recordObj;

    private String previousHash;

    private String blockHash;

    public long timeStamp;
    
    private Record curr_med_data;
    
    public int nonce;

    private int sum=0;

    public Block(ArrayList<Record> record, String previousHash,Record curr_med_data)

    {
    	this.curr_med_data = curr_med_data;

        this.previousHash=previousHash;

        this.timeStamp = new Date().getTime();

        recordObj=record;

        this.blockHash=calculateHash();

    }

    //Calculate new hash based on blocks contents

    public String calculateHash() {

        String calculatedhash = StringUtil.applySha256(previousHash +Integer.toString(nonce));

        return calculatedhash;

    }

    

    //Increases nonce value until hash target is reached.

    public void mineBlock(int difficulty) {

        String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0"

        while(!blockHash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            blockHash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + blockHash);
    }

    public String getPreviousHash() {

        return previousHash;

    }



    public void setPreviousHash(String previousHash) {

        this.previousHash = previousHash;

    }



    public String getBlockHash() {

        return blockHash;

    }



    public void setBlockHash(String blockHash) {

        this.blockHash = blockHash;

    }
    
    public String docname()
    {
    	return this.curr_med_data.doctor;
    }
    
    public String patient_name()
    {
    	return this.curr_med_data.patient;
    }
    
    public void printData()
    {
    	curr_med_data.printData();
    }

}