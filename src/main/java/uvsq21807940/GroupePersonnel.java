package uvsq21807940;

import java.util.ArrayList;
import java.util.List;


import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
public class GroupePersonnel implements PerType, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<PerType> personne = new ArrayList<PerType>();
	
	
	private String nomDuGroupe;
	public GroupePersonnel( String nom){
		this.nomDuGroupe = nom;
	}
	
	
	 public String getName(){
		 return this.nomDuGroupe;
	 }
	
	  
	public void print() {
		System.out.println(this.getName());
	
		for(PerType composant: personne) {
			composant.print();
		}
	}
	
	public boolean contains(PerType composant) {
        return personne.contains(composant);
    }

	
	
	public List<PerType> getList(){
		return (List<PerType>) Collections.unmodifiableCollection(personne) ;
		
		
	}
	
	public void add(PerType composant) {
		personne.add(composant);
	}
	
	
	public void remove(PerType composant) {
		personne.remove(composant);
	}
	
	
	
	
	
	
	public void PerType() {
        Iterator<PerType> ite = personne.iterator();
        System.out.println("-------" + this.getName() + "-------");
        while (ite.hasNext()) {
        	PerType c = ite.next();
            c.print();
        }

	}    
   
    
   @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupePersonnel other = (GroupePersonnel) obj;
        if (personne == null) {
            if (other.personne != null)
                return false;
        } else if (!personne.equals(other.personne))
            return false;
        if (nomDuGroupe == null) {
            if (other.nomDuGroupe != null)
                return false;
        } else if (!nomDuGroupe.equals(other.nomDuGroupe))
            return false;
        return true;
    }

    

}
