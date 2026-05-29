# Brooklyn Nine-Nine – The 12 Islander Problem

## Introduction

In Season 2, Episode 18 ("Captain Peralta") of the sitcom _Brooklyn Nine-Nine_, Captain Raymond Holt presents Jake Peralta and Gina Linetti with a classic logic puzzle known as the "12 islander problem." The scenario serves as a playful yet challenging test of deductive reasoning, showcasing the show's unique blend of humor and intelligence.

## The Scenario

Captain Holt asks:
> “There are 12 identical-looking islanders. One is an imposter who weighs either more or less than the others, but you don't know which. With just three weighings on a balance scale – no weights, no measuring – how can you determine which islander is the imposter and whether they're heavier or lighter?”

## The Question

> Given 12 identical islanders, one of whom is a different weight (heavier or lighter, but you don't know which), how can you, using only a balance scale and only three weighings, identify the imposter and whether they are heavier or lighter?

## Explanation and Solution

The challenge is to pinpoint the different islander and determine if they are heavier or lighter in just three weighings.

### Approach

1. **Divide and Weigh:**
   - Divide the 12 islanders into three groups of four: Group A, Group B, Group C.
   - Weigh Group A vs Group B.

2. **Interpret the First Weighing:**
   - If the scales balance: The imposter is in Group C.
   - If they do not balance: The imposter is in the heavier or lighter group (you don't yet know which).

3. **Second Weighing:**
   - Depending on the outcome of the first weighing, select 4 to test again, mixing members according to specific schemes to track who could be heavy or light.

4. **Third Weighing:**
   - By systematically swapping, recording which group is heavier or lighter, and comparing to expected outcomes from each possible imposter, you can narrow the possibilities after three weighings to a single person and whether they are heavy or light.

### Why It Works

- Each weighing provides three outcomes (left heavy, right heavy, or balanced).
- Three weighings thus allow for \(3^3 = 27\) distinct outcomes.
- There are 24 possibilities among 12 people (any can be heavy or light), plus the situation where all are equal (not possible here, but included in raw computation).
- A well-designed scheme allows each possibility to map to a unique outcome path in the three weighings.

## Conclusion

The "12 islander problem" is a famous logic puzzle that demonstrates clever deduction via limited information. The solution relies on structuring the weighings so that every possible heavy/lighter imposter situation leads to a unique sequence of scale outcomes.

---

**Enjoy testing your friends with Captain Holt’s favorite puzzle!**
