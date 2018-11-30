package com.lambdaschool.myapplication;

import org.json.JSONObject;

public class Pokemon
{
    private Results[] results;

    private null previous;

    private String count;

    public Pokemon(JSONObject jsonObject) {
    }

    private null next;

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public null getPrevious ()
{
    return previous;
}

    public void setPrevious (null previous)
    {
        this.previous = previous;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public null getNext ()
{
    return next;
}

    public void setNext (null next)
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [results = "+results+", previous = "+previous+", count = "+count+", next = "+next+"]";
    }
}

