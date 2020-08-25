object Sol {
  def breakChocolate(x:Int, y:Int):Int = {
    if((x<1) || (y<1)) 0
    else List(((x-1)+(x*(y-1))),((y-1)+(y*(x-1)))).max
  }
}