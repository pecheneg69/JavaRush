package com.javarush.test.level16.lesson05.lesson13.bonus01;

import com.javarush.test.level16.lesson05.lesson13.bonus01.common.*;

/**
 * Created by Алексей on 07.05.2016.
 */
public class ImageReaderFactory
{
   public static ImageReader getReader(ImageTypes x){
       ImageReader y=null;

           if(x==ImageTypes.JPG)  y= new JpgReader();
           else if(x == ImageTypes.BMP) y= new BmpReader();
           else if(x == ImageTypes.PNG) y = new PngReader();
            else{throw  new  IllegalArgumentException("Неизвестный тип картинки");}
       return y;

   }
}
