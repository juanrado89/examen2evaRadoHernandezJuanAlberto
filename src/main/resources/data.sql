-- Insertar ingredientes
INSERT INTO ingredient (ingredient_id, name)
VALUES (1, 'Cebolla'),
       (2, 'Ajo'),
       (3, 'Tomate'),
       (4, 'Pimiento'),
       (5, 'Pechuga de pollo'),
       (6, 'Aceite de oliva'),
       (7, 'Sal'),
       (8, 'Pimienta'),
       (9, 'Arroz'),
       (10, 'Leche'),
       (11, 'Harina'),
       (12, 'Huevo'),
       (13, 'Azúcar'),
       (14, 'Chocolate'),
       (15, 'Pasta'),
       (16, 'Salsa de tomate'),
       (17, 'Queso mozzarella'),
       (18, 'Albahaca'),
       (19, 'Carne picada'),
       (20, 'Fideos'),
       (21, 'Caldo de pollo'),
       (22, 'Maíz'),
       (23, 'Pimiento rojo'),
       (24, 'Cilantro');

-- Insertar recetas
-- Receta 1: Pollo al curry
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (1, 4, 45, 'Pollo al curry', 'Una deliciosa receta de pollo con una salsa de curry picante.');

-- Ingredientes para pollo al curry
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (1, 5, 500, 1), -- Pechuga de pollo
       (2, 1, 2, 1),   -- Cebolla
       (3, 2, 3, 1),   -- Ajo
       (4, 6, 30, 1),  -- Aceite de oliva
       (5, 7, 5, 1);
-- Sal

-- Pasos para pollo al curry
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (1, 1, 1, 'Cortar las pechugas de pollo en trozos.'),
       (2, 1, 2, 'Picar la cebolla y el ajo finamente.'),
       (3, 1, 3, 'Calentar el aceite de oliva en una sartén y sofreír la cebolla y el ajo.'),
       (4, 1, 4, 'Agregar el pollo y cocinar hasta que esté dorado.'),
       (5, 1, 5, 'Agregar la salsa de curry y cocinar a fuego lento durante 20 minutos.');

-- Receta 2: Spaghetti carbonara
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (2, 2, 30, 'Spaghetti carbonara', 'Una receta clásica italiana con pasta, panceta y queso.');

-- Ingredientes para spaghetti carbonara
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (6, 15, 200, 2), -- Pasta
       (7, 12, 2, 2),   -- Huevo
       (8, 17, 100, 2), -- Queso mozzarella
       (9, 1, 1, 2),    -- Cebolla
       (10, 6, 20, 2);
-- Aceite de oliva

-- Pasos para spaghetti carbonara
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (6, 2, 1, 'Cocinar la pasta en agua hirviendo con sal hasta que esté al dente.'),
       (7, 2, 2, 'Picar la panceta y dorarla en una sartén con aceite de oliva.'),
       (8, 2, 3, 'Batir los huevos y agregarles el queso rallado.'),
       (9, 2, 4, 'Escurrir la pasta y mezclarla con la panceta dorada.'),
       (10, 2, 5, 'Agregar la mezcla de huevo y queso a la pasta caliente y revolver bien.');

-- Receta 3: Arroz con pollo
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (3, 6, 40, 'Arroz con pollo', 'Un plato tradicional latinoamericano que combina arroz, pollo y verduras.');

-- Ingredientes para arroz con pollo
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (11, 5, 800, 3), -- Pechuga de pollo
       (12, 1, 1, 3),   -- Cebolla
       (13, 2, 2, 3),   -- Ajo
       (14, 6, 30, 3),  -- Aceite de oliva
       (15, 9, 400, 3);
-- Arroz

-- Pasos para arroz con pollo
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (11, 3, 1, 'Cortar las pechugas de pollo en trozos y sazonar con sal y pimienta.'),
       (12, 3, 2,
        'Picar la cebolla y el ajo finamente.'),
       (13, 3, 3,
        'Calentar el aceite de oliva en una olla y sofreír la cebolla y el ajo.'),
       (14, 3, 4,
        'Agregar el pollo y cocinar hasta que esté dorado.'),
       (15, 3, 5,
        'Incorporar el arroz y cocinar durante 20 minutos hasta que esté listo.');

-- Receta 4: Tortilla de patatas
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (4, 4, 30, 'Tortilla de patatas', 'Un clásico español que combina huevos, patatas y cebolla.');

-- Ingredientes para tortilla de patatas
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (16, 12, 6, 4),   -- Huevo
       (17, 1, 3, 4),    -- Cebolla
       (18, 11, 300, 4), -- Patatas
       (19, 6, 20, 4),   -- Aceite de oliva
       (20, 7, 2, 4);
-- Sal

-- Pasos para tortilla de patatas
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (16, 4, 1, 'Pelar las patatas y cortarlas en rodajas finas.'),
       (17, 4, 2, 'Picar la cebolla en trozos pequeños.'),
       (18, 4, 3, 'Freír las patatas y la cebolla en una sartén con aceite de oliva caliente hasta que estén tiernas.'),
       (19, 4, 4, 'Batir los huevos y salpimentar al gusto.'),
       (20, 4, 5,
        'Agregar las patatas y la cebolla a los huevos batidos y mezclar bien. Cocinar la tortilla en una sartén hasta que esté dorada por ambos lados.');

-- Receta 5: Ensalada César
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (5, 2, 15, 'Ensalada César', 'Una ensalada fresca y deliciosa con pollo, lechuga romana y aderezo César.');

-- Ingredientes para ensalada César
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (21, 5, 200, 5),  -- Pechuga de pollo
       (22, 18, 50, 5),  -- Albahaca
       (23, 15, 100, 5), -- Lechuga romana
       (24, 13, 20, 5),  -- Azúcar
       (25, 6, 30, 5);
-- Aceite de oliva

-- Pasos para ensalada César
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (21, 5, 1,
        'Cocinar la pechuga de pollo en una sartén con aceite de oliva hasta que esté dorada y cocida completamente.'),
       (22, 5, 2, 'Lavar y cortar la lechuga romana en trozos pequeños.'),
       (23, 5, 3, 'Preparar el aderezo César mezclando aceite de oliva, azúcar y albahaca.'),
       (24, 5, 4, 'Cortar la pechuga de pollo en tiras.'),
       (25, 5, 5, 'Colocar la lechuga en un plato, agregar las tiras de pollo encima y rociar con el aderezo César.');

-- Receta 6: Sopa de tomate
INSERT INTO recipe (recipe_id, number_of_people, time_in_minutes, title, description)
VALUES (6, 4, 40, 'Sopa de tomate', 'Una reconfortante sopa de tomate con hierbas y especias.');

-- Ingredientes para sopa de tomate
INSERT INTO recipe_ingredient (recipe_ingredient_id, ingredient_id, quantity, recipe_id)
VALUES (26, 3, 500, 6),  -- Tomate
       (27, 2, 2, 6),    -- Ajo
       (28, 6, 30, 6),   -- Aceite de oliva
       (29, 21, 500, 6), -- Caldo de pollo
       (30, 24, 10, 6);
-- Cilantro

-- Pasos para sopa de tomate
INSERT INTO step (step_id, recipe_id, step_order, description)
VALUES (26, 6, 1, 'Pelar los tomates y picarlos en trozos pequeños.'),
       (27, 6, 2, 'Picar el ajo finamente.'),
       (28, 6, 3, 'Calentar el aceite de oliva en una olla grande y sofreír el ajo hasta que esté dorado.'),
       (29, 6, 4, 'Agregar los tomates a la olla y cocinar durante 10 minutos.'),
       (30, 6, 5, 'Incorporar el caldo de pollo y el cilantro, y cocinar a fuego lento durante 20 minutos más.');

-- Restart de las claves identity
alter table ingredient alter column ingredient_id restart with 100;
alter table recipe alter column recipe_id restart with 100;
alter table recipe_ingredient alter column recipe_ingredient_id restart with 100;
alter table step alter column step_id restart with 100;



