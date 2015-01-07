
package spider.down.gif;

import spider.down.util.FileProcessor;

public class GifProcessor implements Runnable
{

    private String imgName;
    private String imgUrl;

    public GifProcessor(String name, String url)
    {
        this.imgName = name;
        this.imgUrl = url;
    }

    public void run()
    {
        FileProcessor fp = new FileProcessor(this.imgName, this.imgUrl);
        try
        {
            System.out.println("下载保存图片url：" + this.imgUrl);
            fp.saveGif();

        } catch (Exception e)
        {
            System.out.println("下载保存图片失败，url：" + this.imgUrl);
            e.printStackTrace();
        }

    }

}
