import java.util.ArrayList;
public class MulthreadingHPsspells {
	public static void main(String[] args) {
		ArrayList<Spell> spells = new ArrayList<>();
		spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
		spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
		spells.add(new Spell("Engorgio", Spell.SpellType.SPELL, "Enlarges something."));
		spells.add(new Spell("Fidelius", Spell.SpellType.SPELL, "Hides a secret within someone."));
		spells.add(new Spell("Finite Incantatum", Spell.SpellType.SPELL, "Stops all current spells."));
		spells.add(new Spell("Locomotor Mortis", Spell.SpellType.SPELL, "Locks an opponent's legs."));
		System.out.println("1st parallel stream: ");
		spells.parallelStream().forEach(s -> System.out.println(s));
		System.out.println("\n2nd parallel stream: ");
		spells.parallelStream().forEach(s -> System.out.println(s));
	}
}