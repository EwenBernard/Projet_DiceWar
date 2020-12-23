package com.dicewar;

public class Map {
    ArrayList<ArrayList<Territory>> map;

    final static int HEIGHT = 150;
    final static int WIDTH = 200;

    private BufferedReader file;
    private String line;

    Map()
    {
        this.map = mapRandomGenerator(HEIGHT, WIDTH);
       
    }

    Map(String fileLoc)
    {
        this.file = new BufferedReader(new FileReader(fileLoc));
        this.map = this.file.mapFromCsv();
    }


    public mapReader(String fileLoc) throws IOException
    {
        this.file = new BufferedReader(new FileReader(fileLoc));
    }

    private boolean readLine() throws IOException
    {
        this.line = this.file.readLine();
        return this.line != null;
    }

    private mapFromCsv(String fileName)
    {

    }

}
 