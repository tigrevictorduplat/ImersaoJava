package TierFilms;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class StickerFormatter {

    public void converterFig(InputStream inputStream, String tituloFig, String conteudoTexto) throws Exception{
        //Receber Imagem
        BufferedImage imagemOrigem = ImageIO.read(inputStream);
        //Criar Imagem Vazia na Memória com Transparência
        int larguraOrigem = imagemOrigem.getWidth();
        int alturaOrigem = imagemOrigem.getHeight();
        int alturaNova = (int) Math.round(alturaOrigem*1.2);
        BufferedImage imagemFormatada = new BufferedImage(larguraOrigem,alturaNova, BufferedImage.TRANSLUCENT);
        //Usar a Imagem Antiga em uma Nova
        Graphics2D caneta = (Graphics2D) imagemFormatada.getGraphics();
        caneta.drawImage(imagemOrigem, 0, 0, null);
        //Importar Fonte
        var razaoFonteImagem = 4.28;
        int tamanhoFonte = (int) Math.round(larguraOrigem/razaoFonteImagem);
       var novaFonte =  new Font(Font.MONOSPACED,Font.BOLD, tamanhoFonte );
        caneta.setFont(novaFonte);
        caneta.setColor(Color.YELLOW);
        //Escrever na Nova Imagem
        int alturaTexto = (int) Math.round((alturaOrigem*1.15));
        var larguraTexto = caneta.getFontMetrics().stringWidth(conteudoTexto);
        var posicaoHorizontalTexto = (int) Math.round(((imagemFormatada.getWidth())/2) - (larguraTexto/2));
        caneta.drawString(conteudoTexto, posicaoHorizontalTexto, alturaTexto);
        //Exportar tudo pra um único Arquivo
        ImageIO.write(imagemFormatada, "png", new File("TierFilms/BancoImagem/"+tituloFig));
        
    }
}