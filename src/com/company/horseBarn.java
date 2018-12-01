package com.company;

public class horseBarn{
    private Horse[] spaces;

    public horseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }
    public void consolidate()
    {
        for (int i = 0; i < this.spaces.length - 1; i++)
        {
            if (this.spaces[i] == null)
            {
                for (int j = 0; j < this.spaces.length; j++)
                {
                    if (this.spaces[j] != null)
                    {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }
    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++)
        {
            if(this.spaces[i] != null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }

    public String toString()
    {
        String total = "";
        for(int i=0; i<this.spaces.length; i++)
        {
            total += this.spaces[i] + "";
        }
        return total;
    }
}
