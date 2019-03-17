package bean;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Data
@ManagedBean(name = "pessoa")
public class PessoaBean {

    private String nome;
    private List<String> nomes = new ArrayList<String>();
    private HtmlCommandButton commandButton;
    private HtmlInputText inputText;

    public String addNome(){
        nomes.add(nome);
        if(nomes.size() == 3){
            commandButton.setDisabled(true);
            inputText.setDisabled(true);
            return "pagnavegada.xhtml";
        }
        return "";
    }

}
