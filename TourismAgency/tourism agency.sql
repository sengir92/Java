PGDMP                          |            TourismAgency    13.13    13.13 "    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16879    TourismAgency    DATABASE     l   CREATE DATABASE "TourismAgency" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "TourismAgency";
                postgres    false            �            1259    16890    hotel    TABLE     �  CREATE TABLE public.hotel (
    hotel_id bigint NOT NULL,
    hotel_name text NOT NULL,
    hotel_address text NOT NULL,
    hotel_mail text NOT NULL,
    hotel_phone text NOT NULL,
    hotel_star text NOT NULL,
    hotel_car_park boolean NOT NULL,
    hotel_wifi boolean NOT NULL,
    hotel_pool boolean NOT NULL,
    hotel_fitness boolean NOT NULL,
    hotel_concierge boolean NOT NULL,
    hotel_spa boolean NOT NULL,
    hotel_room_service boolean NOT NULL
);
    DROP TABLE public.hotel;
       public         heap    postgres    false            �            1259    16898    hotel_hotel_id_seq    SEQUENCE     �   ALTER TABLE public.hotel ALTER COLUMN hotel_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.hotel_hotel_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    202            �            1259    16900    hotel_pension    TABLE     �   CREATE TABLE public.hotel_pension (
    pension_id bigint NOT NULL,
    hotel_id integer NOT NULL,
    pension_type text NOT NULL
);
 !   DROP TABLE public.hotel_pension;
       public         heap    postgres    false            �            1259    16908 "   hotel_pension_hotel_pension_id_seq    SEQUENCE     �   ALTER TABLE public.hotel_pension ALTER COLUMN pension_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.hotel_pension_hotel_pension_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    204            �            1259    16910    hotel_season    TABLE     �   CREATE TABLE public.hotel_season (
    season_id bigint NOT NULL,
    hotel_id integer NOT NULL,
    start_date date NOT NULL,
    finish_date date NOT NULL
);
     DROP TABLE public.hotel_season;
       public         heap    postgres    false            �            1259    16946     hotel_season_hotel_season_id_seq    SEQUENCE     �   ALTER TABLE public.hotel_season ALTER COLUMN season_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.hotel_season_hotel_season_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    206            �            1259    16950    reservation    TABLE     �  CREATE TABLE public.reservation (
    reservation_id bigint NOT NULL,
    room_id integer NOT NULL,
    check_out_date date NOT NULL,
    total_price integer NOT NULL,
    adult_number integer NOT NULL,
    guest_name text NOT NULL,
    guest_citizen_id text NOT NULL,
    guest_mail text NOT NULL,
    guest_phone text NOT NULL,
    check_in_date date NOT NULL,
    child_number integer
);
    DROP TABLE public.reservation;
       public         heap    postgres    false            �            1259    16948    reservation_reservation_id_seq    SEQUENCE     �   ALTER TABLE public.reservation ALTER COLUMN reservation_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.reservation_reservation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    211            �            1259    16936    room    TABLE     =  CREATE TABLE public.room (
    room_id bigint NOT NULL,
    hotel_id integer NOT NULL,
    hotel_pension_id integer NOT NULL,
    hotel_season_id integer NOT NULL,
    room_type text NOT NULL,
    room_stock integer NOT NULL,
    room_adult_price integer NOT NULL,
    room_child_price integer NOT NULL,
    room_bed_capacity integer NOT NULL,
    room_square_meter integer NOT NULL,
    room_television boolean NOT NULL,
    room_minibar boolean NOT NULL,
    room_game_console boolean NOT NULL,
    room_cash_box boolean NOT NULL,
    room_projection boolean NOT NULL
);
    DROP TABLE public.room;
       public         heap    postgres    false            �            1259    16944    room_room_id_seq    SEQUENCE     �   ALTER TABLE public.room ALTER COLUMN room_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.room_room_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    207            �            1259    16880    user    TABLE     �   CREATE TABLE public."user" (
    user_id bigint NOT NULL,
    user_name text NOT NULL,
    user_pass text NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public."user";
       public         heap    postgres    false            �            1259    16888    user_user_id_seq    SEQUENCE     �   ALTER TABLE public."user" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    200            �          0    16890    hotel 
   TABLE DATA           �   COPY public.hotel (hotel_id, hotel_name, hotel_address, hotel_mail, hotel_phone, hotel_star, hotel_car_park, hotel_wifi, hotel_pool, hotel_fitness, hotel_concierge, hotel_spa, hotel_room_service) FROM stdin;
    public          postgres    false    202   �*       �          0    16900    hotel_pension 
   TABLE DATA           K   COPY public.hotel_pension (pension_id, hotel_id, pension_type) FROM stdin;
    public          postgres    false    204   �*       �          0    16910    hotel_season 
   TABLE DATA           T   COPY public.hotel_season (season_id, hotel_id, start_date, finish_date) FROM stdin;
    public          postgres    false    206   �+       �          0    16950    reservation 
   TABLE DATA           �   COPY public.reservation (reservation_id, room_id, check_out_date, total_price, adult_number, guest_name, guest_citizen_id, guest_mail, guest_phone, check_in_date, child_number) FROM stdin;
    public          postgres    false    211   �+       �          0    16936    room 
   TABLE DATA             COPY public.room (room_id, hotel_id, hotel_pension_id, hotel_season_id, room_type, room_stock, room_adult_price, room_child_price, room_bed_capacity, room_square_meter, room_television, room_minibar, room_game_console, room_cash_box, room_projection) FROM stdin;
    public          postgres    false    207   �+       �          0    16880    user 
   TABLE DATA           J   COPY public."user" (user_id, user_name, user_pass, user_role) FROM stdin;
    public          postgres    false    200   Z,       �           0    0    hotel_hotel_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hotel_hotel_id_seq', 2, true);
          public          postgres    false    203            �           0    0 "   hotel_pension_hotel_pension_id_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.hotel_pension_hotel_pension_id_seq', 13, true);
          public          postgres    false    205            �           0    0     hotel_season_hotel_season_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.hotel_season_hotel_season_id_seq', 4, true);
          public          postgres    false    209            �           0    0    reservation_reservation_id_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.reservation_reservation_id_seq', 6, true);
          public          postgres    false    210            �           0    0    room_room_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.room_room_id_seq', 3, true);
          public          postgres    false    208            �           0    0    user_user_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.user_user_id_seq', 74, true);
          public          postgres    false    201            J           2606    16917     hotel_pension hotel_pension_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.hotel_pension
    ADD CONSTRAINT hotel_pension_pkey PRIMARY KEY (pension_id);
 J   ALTER TABLE ONLY public.hotel_pension DROP CONSTRAINT hotel_pension_pkey;
       public            postgres    false    204            H           2606    16897    hotel hotel_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT hotel_pkey PRIMARY KEY (hotel_id);
 :   ALTER TABLE ONLY public.hotel DROP CONSTRAINT hotel_pkey;
       public            postgres    false    202            L           2606    16914    hotel_season hotel_season_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.hotel_season
    ADD CONSTRAINT hotel_season_pkey PRIMARY KEY (season_id);
 H   ALTER TABLE ONLY public.hotel_season DROP CONSTRAINT hotel_season_pkey;
       public            postgres    false    206            P           2606    16957    reservation reservation_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_pkey PRIMARY KEY (reservation_id);
 F   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_pkey;
       public            postgres    false    211            N           2606    16943    room room_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_pkey PRIMARY KEY (room_id);
 8   ALTER TABLE ONLY public.room DROP CONSTRAINT room_pkey;
       public            postgres    false    207            F           2606    16887    user user_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            postgres    false    200            �   >   x�3�,I-.A���9��FƜ%E���@a�40�\F�ŉ)��P��<.V����� F{      �   �   x�e�K1��͏S�q+ʮ'�y)ۮ���!�|�Ad��|�
ա�|́#h�ձ�b����g�Iގ��V�޿z�.�[C=ߙ>�]�.XK�B%ن�����a��
�;�s�7�XjqZK�a����O^g ���=      �   6   x�3�4�4202�50"(�T�ؐˈ��5���d��z�eL�z�M����� �H      �      x������ � �      �   ^   x�%�1
�0����0������:	U
�K{��O �/
�r}�� B3���������0��lеB�T�-;���{m+:`�'��}Ul�      �   ;   x�3�LL����4426�0��,9���57�L5�܂����T.CS�T#0����qqq ���     