// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class ImportFrom extends stmtType {
    public NameTokType module;
    public aliasType[] names;
    public int level;

    public ImportFrom(NameTokType module, aliasType[] names, int level) {
        this.module = module;
        this.names = names;
        this.level = level;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((module == null) ? 0 : module.hashCode());
        result = prime * result + Arrays.hashCode(names);
        result = prime * result + level;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ImportFrom other = (ImportFrom) obj;
        if (module == null) { if (other.module != null) return false;}
        else if (!module.equals(other.module)) return false;
        if (!Arrays.equals(names, other.names)) return false;
        if(this.level != other.level) return false;
        return true;
    }
    @Override
    public ImportFrom createCopy() {
        return createCopy(true);
    }
    @Override
    public ImportFrom createCopy(boolean copyComments) {
        aliasType[] new0;
        if(this.names != null){
        new0 = new aliasType[this.names.length];
        for(int i=0;i<this.names.length;i++){
            new0[i] = (aliasType) (this.names[i] != null?
            this.names[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.names;
        }
        ImportFrom temp = new
        ImportFrom(module!=null?(NameTokType)module.createCopy(copyComments):null, new0, level);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("ImportFrom[");
        sb.append("module=");
        sb.append(dumpThis(this.module));
        sb.append(", ");
        sb.append("names=");
        sb.append(dumpThis(this.names));
        sb.append(", ");
        sb.append("level=");
        sb.append(dumpThis(this.level));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitImportFrom(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (module != null) {
            module.accept(visitor);
        }
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null) {
                    names[i].accept(visitor);
                }
            }
        }
    }

}
